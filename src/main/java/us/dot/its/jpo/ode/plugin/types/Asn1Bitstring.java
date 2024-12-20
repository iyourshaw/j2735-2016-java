package us.dot.its.jpo.ode.plugin.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.dot.its.jpo.ode.plugin.serialization.BitstringSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.BitSet;
import java.util.HexFormat;

import static us.dot.its.jpo.ode.plugin.utils.BitUtils.reverseBits;

@JsonSerialize(using = BitstringSerializer.class)
public abstract class Asn1Bitstring implements Asn1Type {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    final BitSet bits;
    final int size;
    final boolean hasExtensionMarker;
    final String[] names;

    public Asn1Bitstring(int size, boolean hasExtensionMarker, String[] names) {
        this.size = size;
        this.hasExtensionMarker = hasExtensionMarker;
        this.bits = new BitSet(size);
        this.names = names;
    }

    public int size() {
        return size;
    }

    public boolean hasExtensionMarker() {
        return hasExtensionMarker;
    }

    public boolean get(int bitIndex) {
        return bits.get(bitIndex);
    }

    public void set(int bitIndex, boolean value) {
        bits.set(bitIndex, value);
    }

    public String binaryString() {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = get(i) ? '1' : '0';
        }
        return new String(chars);
    }

    public String hexString() {
        HexFormat hex = HexFormat.of();
        return hex.formatHex(reverseBits(bits.toByteArray()));
    }

    public void fromBinaryString(String str) {
        if (str == null) {
            bits.clear();
            return;
        }
        char[] chars = str.toCharArray();
        if (chars.length < size) {
            throw new IllegalArgumentException("Not enough characters in string " + str);
        }
        for (int i = 0; i < size; i++) {
            char c = chars[i];
            set(i, c == '1');
        }
    }

    public void fromHexString(String str) {
        if (str == null) {
            bits.clear();
            return;
        }
        HexFormat hex = HexFormat.of();
        byte[] bytes = reverseBits(hex.parseHex(str));
        logger.debug("reversed bytes: {}", bytes);
        BitSet newBits = BitSet.valueOf(bytes);
        logger.debug("newBits: {}", newBits);
        bits.clear();
        bits.or(newBits);
        logger.debug("binaryString: {}", binaryString());
    }

    public String name(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException(String.format("Index %s out of range %s-%s", index, 0, size()));
        }
        return names[index];
    }

    @Override
    public int hashCode() {
        return bits.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Asn1Bitstring bitstring) {
            return bits.equals(bitstring.bits);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return binaryString();
    }


}
