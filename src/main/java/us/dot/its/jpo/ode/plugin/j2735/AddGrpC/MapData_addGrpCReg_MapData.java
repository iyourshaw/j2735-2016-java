package us.dot.its.jpo.ode.plugin.j2735.AddGrpC;

import com.fasterxml.jackson.annotation.JsonRootName;
import us.dot.its.jpo.ode.plugin.j2735.REGION.Reg_MapData;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
@JsonRootName("Reg_MapData")
public class MapData_addGrpCReg_MapData extends Reg_MapData<MapData_addGrpC> {

	public MapData_addGrpCReg_MapData() {
		super(3, "MapData_addGrpC");
	}

	@Override
	@JsonSerialize(using = MapData_addGrpCReg_MapDataValueSerializer.class)
	public MapData_addGrpC getRegExtValue() {
		return super.getRegExtValue();
	}

	@Override
	@JsonDeserialize(using = MapData_addGrpCReg_MapDataValueDeserializer.class)
	public void setRegExtValue(MapData_addGrpC value) {
		super.setRegExtValue(value);
	}
}