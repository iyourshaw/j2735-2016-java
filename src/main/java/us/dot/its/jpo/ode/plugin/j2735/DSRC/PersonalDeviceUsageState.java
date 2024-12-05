package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Bitstring;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 
 *******************************************************************************
 *
 * This source file was generated by a tool. Beware manual edits might be
 * overwritten in future releases. asn1jvm v1.0-SNAPSHOT
 *
 *******************************************************************************
 * Copyright 2024 USDOT
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************
 * 
 */
@JsonDeserialize(using = PersonalDeviceUsageStateDeserializer.class)
public class PersonalDeviceUsageState extends Asn1Bitstring {

	public boolean isUnavailable() {
		return get(0);
	}

	public void setUnavailable(boolean unavailable) {
		set(0, unavailable);
	}

	public boolean isOther() {
		return get(1);
	}

	public void setOther(boolean other) {
		set(1, other);
	}

	public boolean isIdle() {
		return get(2);
	}

	public void setIdle(boolean idle) {
		set(2, idle);
	}

	public boolean isListeningToAudio() {
		return get(3);
	}

	public void setListeningToAudio(boolean listeningToAudio) {
		set(3, listeningToAudio);
	}

	public boolean isTyping() {
		return get(4);
	}

	public void setTyping(boolean typing) {
		set(4, typing);
	}

	public boolean isCalling() {
		return get(5);
	}

	public void setCalling(boolean calling) {
		set(5, calling);
	}

	public boolean isPlayingGames() {
		return get(6);
	}

	public void setPlayingGames(boolean playingGames) {
		set(6, playingGames);
	}

	public boolean isReading() {
		return get(7);
	}

	public void setReading(boolean reading) {
		set(7, reading);
	}

	public boolean isViewing() {
		return get(8);
	}

	public void setViewing(boolean viewing) {
		set(8, viewing);
	}

	public PersonalDeviceUsageState() {
		super(9, false, new String[]{"unavailable", "other", "idle", "listeningToAudio", "typing", "calling",
				"playingGames", "reading", "viewing"});
	}
}