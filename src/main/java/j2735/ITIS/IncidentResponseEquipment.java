package j2735.ITIS;

import asn2pojo.runtime.types.Asn1Enumerated;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonSerialize(using = IncidentResponseEquipmentSerializer.class)
@JsonDeserialize(using = IncidentResponseEquipmentDeserializer.class)
public enum IncidentResponseEquipment implements Asn1Enumerated {
	ground_fire_suppression(9985, "ground-fire-suppression"), heavy_ground_equipment(9986,
			"heavy-ground-equipment"), aircraft(9988, "aircraft"), marine_equipment(9989,
					"marine-equipment"), support_equipment(9990, "support-equipment"), medical_rescue_unit(9991,
							"medical-rescue-unit"), other(9993, "other"), ground_fire_suppression_other(9994,
									"ground-fire-suppression-other"), engine(9995, "engine"), truck_or_aerial(9996,
											"truck-or-aerial"), quint(9997, "quint"), tanker_pumper_combination(9998,
													"tanker-pumper-combination"), brush_truck(10000,
															"brush-truck"), aircraft_rescue_firefighting(10001,
																	"aircraft-rescue-firefighting"), heavy_ground_equipment_other(
																			10004,
																			"heavy-ground-equipment-other"), dozer_or_plow(
																					10005,
																					"dozer-or-plow"), tractor(10006,
																							"tractor"), tanker_or_tender(
																									10008,
																									"tanker-or-tender"), aircraft_other(
																											10024,
																											"aircraft-other"), aircraft_fixed_wing_tanker(
																													10025,
																													"aircraft-fixed-wing-tanker"), helitanker(
																															10026,
																															"helitanker"), helicopter(
																																	10027,
																																	"helicopter"), marine_equipment_other(
																																			10034,
																																			"marine-equipment-other"), fire_boat_with_pump(
																																					10035,
																																					"fire-boat-with-pump"), boat_no_pump(
																																							10036,
																																							"boat-no-pump"), support_apparatus_other(
																																									10044,
																																									"support-apparatus-other"), breathing_apparatus_support(
																																											10045,
																																											"breathing-apparatus-support"), light_and_air_unit(
																																													10046,
																																													"light-and-air-unit"), medical_rescue_unit_other(
																																															10054,
																																															"medical-rescue-unit-other"), rescue_unit(
																																																	10055,
																																																	"rescue-unit"), urban_search_rescue_unit(
																																																			10056,
																																																			"urban-search-rescue-unit"), high_angle_rescue(
																																																					10057,
																																																					"high-angle-rescue"), crash_fire_rescue(
																																																							10058,
																																																							"crash-fire-rescue"), bLS_unit(
																																																									10059,
																																																									"bLS-unit"), aLS_unit(
																																																											10060,
																																																											"aLS-unit"), mobile_command_post(
																																																													10075,
																																																													"mobile-command-post"), chief_officer_car(
																																																															10076,
																																																															"chief-officer-car"), hAZMAT_unit(
																																																																	10077,
																																																																	"hAZMAT-unit"), type_i_hand_crew(
																																																																			10078,
																																																																			"type-i-hand-crew"), type_ii_hand_crew(
																																																																					10079,
																																																																					"type-ii-hand-crew"), privately_owned_vehicle(
																																																																							10083,
																																																																							"privately-owned-vehicle"), other_apparatus_resource(
																																																																									10084,
																																																																									"other-apparatus-resource"), ambulance(
																																																																											10085,
																																																																											"ambulance"), bomb_squad_van(
																																																																													10086,
																																																																													"bomb-squad-van"), combine_harvester(
																																																																															10087,
																																																																															"combine-harvester"), construction_vehicle(
																																																																																	10088,
																																																																																	"construction-vehicle"), farm_tractor(
																																																																																			10089,
																																																																																			"farm-tractor"), grass_cutting_machines(
																																																																																					10090,
																																																																																					"grass-cutting-machines"), hAZMAT_containment_tow(
																																																																																							10091,
																																																																																							"hAZMAT-containment-tow"), heavy_tow(
																																																																																									10092,
																																																																																									"heavy-tow"), light_tow(
																																																																																											10094,
																																																																																											"light-tow"), flatbed_tow(
																																																																																													10114,
																																																																																													"flatbed-tow"), hedge_cutting_machines(
																																																																																															10093,
																																																																																															"hedge-cutting-machines"), mobile_crane(
																																																																																																	10095,
																																																																																																	"mobile-crane"), refuse_collection_vehicle(
																																																																																																			10096,
																																																																																																			"refuse-collection-vehicle"), resurfacing_vehicle(
																																																																																																					10097,
																																																																																																					"resurfacing-vehicle"), road_sweeper(
																																																																																																							10098,
																																																																																																							"road-sweeper"), roadside_litter_collection_crews(
																																																																																																									10099,
																																																																																																									"roadside-litter-collection-crews"), salvage_vehicle(
																																																																																																											10100,
																																																																																																											"salvage-vehicle"), sand_truck(
																																																																																																													10101,
																																																																																																													"sand-truck"), snowplow(
																																																																																																															10102,
																																																																																																															"snowplow"), steam_roller(
																																																																																																																	10103,
																																																																																																																	"steam-roller"), swat_team_van(
																																																																																																																			10104,
																																																																																																																			"swat-team-van"), track_laying_vehicle(
																																																																																																																					10105,
																																																																																																																					"track-laying-vehicle"), unknown_vehicle(
																																																																																																																							10106,
																																																																																																																							"unknown-vehicle"), white_lining_vehicle(
																																																																																																																									10107,
																																																																																																																									"white-lining-vehicle"), dump_truck(
																																																																																																																											10108,
																																																																																																																											"dump-truck"), supervisor_vehicle(
																																																																																																																													10109,
																																																																																																																													"supervisor-vehicle"), snow_blower(
																																																																																																																															10110,
																																																																																																																															"snow-blower"), rotary_snow_blower(
																																																																																																																																	10111,
																																																																																																																																	"rotary-snow-blower"), road_grader(
																																																																																																																																			10112,
																																																																																																																																			"road-grader"), steam_truck(
																																																																																																																																					10113,
																																																																																																																																					"steam-truck");

	private final int index;
	private final String name;

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public boolean hasExtensionMarker() {
		return false;
	}

	private IncidentResponseEquipment(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return -1;
	}
}