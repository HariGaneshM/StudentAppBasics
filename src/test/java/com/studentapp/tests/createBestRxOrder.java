package com.studentapp.tests;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class createBestRxOrder {
	
//	@DisplayName("Create New BestRx Order")
//	@Test
	void createOrder() {
		
		String Body = "{\r\n"
				+ "    \"APIKey\": \"33bb7b1afd9355ef8641a23f0f3d57e7f1fb6a7d\",\r\n"
				+ "    \"PharmacyNumber\": \"1487163598\",\r\n"
				+ "    \"transaction_id\": \"888057520190315\",\r\n"
				+ "    \"transaction_date\": \"2020-09-21\",\r\n"
				+ "    \"transaction_time\": \"00:30:21\",\r\n"
				+ "    \"rx_number\": \"2333981\",\r\n"
				+ "    \"patient_id\": 12345,\r\n"
				+ "    \"patient_last_name\": \"WinleviPat\",\r\n"
				+ "    \"patient_first_name\": \"Patient007\",\r\n"
				+ "    \"patient_middle_name\": \"\",\r\n"
				+ "    \"patient_prefix\": \"\",\r\n"
				+ "    \"patient_suffix\": \"\",\r\n"
				+ "    \"patient_address1\": \"111 Castro St\",\r\n"
				+ "    \"patient_address2\": \"\",\r\n"
				+ "    \"patient_city\": \"San Franscisco\",\r\n"
				+ "    \"patient_state\": \"CA\",\r\n"
				+ "    \"patient_zip\": \"94114\",\r\n"
				+ "    \"patient_home_phone\": \"\",\r\n"
				+ "    \"patient_cell_phone\": \"\",\r\n"
				+ "    \"patient_work_phone\": \"\",\r\n"
				+ "    \"patient_dob\": \"1995-10-10\",\r\n"
				+ "    \"patient_gender\": \"F\",\r\n"
				+ "    \"patient_email\": \"qa-zenq+76erty65445t007@usephil.com\",\r\n"
				+ "    \"patient_group\": \"\",\r\n"
				+ "    \"family_email\": \"\",\r\n"
				+ "    \"patient_short_remark\": \"Test short remark\",\r\n"
				+ "    \"patient_remark\": \"Patient remark\",\r\n"
				+ "    \"family_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"patient_shipto_address1\": \"111 Castro St\",\r\n"
				+ "    \"patient_shipto_address2\": \"\",\r\n"
				+ "    \"patient_shipto_city\": \"San Franscisco\",\r\n"
				+ "    \"patient_shipto_state\": \"CA\",\r\n"
				+ "    \"patient_shipto_zip\": \"94114\",\r\n"
				+ "    \"is_deactivated\": false,\r\n"
				+ "    \"transferred_out\": false,\r\n"
				+ "    \"bill_status\": \"3\",\r\n"
				+ "    \"bill_status_text\": \"Transmitted\",\r\n"
				+ "    \"workflow_status\": \"0\",\r\n"
				+ "    \"workflow_status_text\": \"New Rx Entered into System\",\r\n"
				+ "    \"fill_number\": \"1\",\r\n"
				+ "    \"fill_date\": \"2022-07-07\",\r\n"
				+ "    \"fill_time\": \"00:30:46\",\r\n"
				+ "    \"picked_up\": \"false\",\r\n"
				+ "    \"delivered\": \"false\",\r\n"
				+ "    \"qty_ordered\": \"1\",\r\n"
				+ "    \"qty_filled\": \"\",\r\n"
				+ "    \"days_supply\": \"30\",\r\n"
				+ "    \"refills_authorized\": \"5\",\r\n"
				+ "    \"refills_remaining\": \"5\",\r\n"
				+ "    \"refill_number\": \"0\",\r\n"
				+ "    \"refill_exp_date\": \"2022-07-07\",\r\n"
				+ "    \"drug_ndc\": \"47335099436\",\r\n"
				+ "    \"drug_gpi\": \"36150040200330\",\r\n"
				+ "    \"drug_name\": \"WINLEVI® (CLASCOTERONE) CREAM 1%\",\r\n"
				+ "    \"drug_schedule\": \"0\",\r\n"
				+ "    \"drug_is_generic\": \"false\",\r\n"
				+ "    \"drug_package_size\": \"1\",\r\n"
				+ "    \"drug_color\": \"WHITE TO OFF WHITE\",\r\n"
				+ "    \"drug_shape\": \"ROUND,CONVEX,BEVELED EDGE\",\r\n"
				+ "    \"drug_front_imprint\": \"S\",\r\n"
				+ "    \"drug_back_imprint\": \"11  2\",\r\n"
				+ "    \"drug_misc_info\": \"Convex,White to off-white,Beveled edge\",\r\n"
				+ "    \"drug_strength\": \"1%\",\r\n"
				+ "    \"lot_number\": \"\",\r\n"
				+ "    \"lot_exp_date\": \"\",\r\n"
				+ "    \"retail\": \"80.00\",\r\n"
				+ "    \"billed\": \"75.38\",\r\n"
				+ "    \"payers\": [\r\n"
				+ "        {\r\n"
				+ "            \"plan_seq_no\": \"1\",\r\n"
				+ "            \"plan_code\": \"TESTCPAY50\",\r\n"
				+ "            \"plan_name\": \"TEST COPAY 50\",\r\n"
				+ "            \"plan_bin\": \"006144\",\r\n"
				+ "            \"plan_pcn\": \"COPAY50\",\r\n"
				+ "            \"card_id\": \"44444444\",\r\n"
				+ "            \"group\": \"\",\r\n"
				+ "            \"person_code\": \"\",\r\n"
				+ "            \"relation_code\": \"\",\r\n"
				+ "            \"plan_bill_status\": \"5\",\r\n"
				+ "            \"plan_bill_status_text\": \"{{plan_bill_status_text}}\",\r\n"
				+ "            \"cost_paid\": \"218.20\",\r\n"
				+ "            \"disp_fee_paid\": \"2.00\",\r\n"
				+ "            \"tax_paid\": \"3.00\",\r\n"
				+ "            \"discount\": \"4.00\",\r\n"
				+ "            \"pat_pay_amount\": \"300.00\",\r\n"
				+ "            \"due_from_payer\": \"300\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"plan_seq_no\": \"2\",\r\n"
				+ "            \"plan_code\": \"TESTREJ70\",\r\n"
				+ "            \"plan_name\": \"TEST REJECTION CODE 40\",\r\n"
				+ "            \"plan_bin\": \"012189\",\r\n"
				+ "            \"plan_pcn\": \"REJ40\",\r\n"
				+ "            \"card_id\": \"44444444\",\r\n"
				+ "            \"group\": \"\",\r\n"
				+ "            \"person_code\": \"\",\r\n"
				+ "            \"relation_code\": \"\",\r\n"
				+ "            \"plan_bill_status\": \"5\",\r\n"
				+ "            \"plan_bill_status_text\": \"Rejected\",\r\n"
				+ "            \"cost_paid\": \"0.00\",\r\n"
				+ "            \"disp_fee_paid\": \"0.00\",\r\n"
				+ "            \"tax_paid\": \"0.00\",\r\n"
				+ "            \"discount\": \"0.00\",\r\n"
				+ "            \"pat_pay_amount\": \"0.00\",\r\n"
				+ "            \"due_from_payer\": \"0.00\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"cost\": \"0\",\r\n"
				+ "    \"patient_amount_due\": \"300.00\",\r\n"
				+ "    \"due_from_insurance\": \"168.20\",\r\n"
				+ "    \"total_paid\": \"218.20\",\r\n"
				+ "    \"margin\": \"217.31\",\r\n"
				+ "    \"margin_percent\": \"24416.85\",\r\n"
				+ "    \"is340b\": \"true\",\r\n"
				+ "    \"dispense_as_written\": \"true\",\r\n"
				+ "    \"date_rx_written\": \"2018-12-04\",\r\n"
				+ "    \"signature\": \"By Mouth\",\r\n"
				+ "    \"dosage_info\": [\r\n"
				+ "        {\r\n"
				+ "            \"dose_slot\": 1,\r\n"
				+ "            \"dose_time\": \"MORNING\",\r\n"
				+ "            \"dose_qty\": \"1\",\r\n"
				+ "            \"dose_days\": \"daily\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"rx_source\": \"3 - Electronic\",\r\n"
				+ "    \"rph_initials\": \"VS\",\r\n"
				+ "    \"tech_initials\": \"\",\r\n"
				+ "    \"rx_serial_number\": \"\",\r\n"
				+ "    \"submission_clar_code\": \"20\",\r\n"
				+ "    \"other_coverage_code\": \"08\",\r\n"
				+ "    \"horizon_graveyard_code\": \"\",\r\n"
				+ "    \"diagnosis\": [\r\n"
				+ "        {\r\n"
				+ "            \"qualifier\": \"02\",\r\n"
				+ "            \"code\": \"I10\",\r\n"
				+ "            \"description\": \"Essential (primary) hypertension\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"qualifier\": \"02\",\r\n"
				+ "            \"code\": \"I27.0\",\r\n"
				+ "            \"description\": \"Primary pulmonary hypertension\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"doctor_id\": 4696,\r\n"
				+ "    \"doctor_last_name\": \"Acosta\",\r\n"
				+ "    \"doctor_first_name\": \"Karla\",\r\n"
				+ "    \"doctor_middle_name\": \"\",\r\n"
				+ "    \"doctor_prefix\": \"\",\r\n"
				+ "    \"doctor_suffix\": \"\",\r\n"
				+ "    \"doctor_npi\": \"1871008755\",\r\n"
				+ "    \"doctor_dea\": \"Puran321256\",\r\n"
				+ "    \"doctor_address1\": \"160 E VIRGINIA ST STE 100\",\r\n"
				+ "    \"doctor_address2\": \"\",\r\n"
				+ "    \"doctor_city\": \"San Jose\",\r\n"
				+ "    \"doctor_state\": \"CA\",\r\n"
				+ "    \"doctor_zip\": \"95127\",\r\n"
				+ "    \"doctor_phone\": \"4085796178\",\r\n"
				+ "    \"doctor_fax\": \"1111111111\",\r\n"
				+ "    \"doctor_email\": \"\",\r\n"
				+ "    \"doctor_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"next_refill_date\": \"2020-10-14\",\r\n"
				+ "    \"drug_therapeutic_class\": \"\",\r\n"
				+ "    \"prescribed_drug\": \"Sun Pharma\",\r\n"
				+ "    \"filled_by\": \"\",\r\n"
				+ "    \"rx_remark\": \"\",\r\n"
				+ "    \"erx_pharmacy_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"erx_prescriber_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"written_date_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"inactivate_rx_remark\": \"DO NOT ADD\",\r\n"
				+ "    \"shipping_provider\": \"\",\r\n"
				+ "    \"shipping_tracking_number\": \"\",\r\n"
				+ "    \"dispense_using\": \"Safety Caps\",\r\n"
				+ "    \"is_medsync_shortfill\": false\r\n"
				+ "}";
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .when()
		   .body(Body)
		   .post("https://capi.dev.phil.us/api/bestrx/v1/prescriptions")
		   .then()
		   .statusCode(200);
	}
	
	
	public static void main(String[] args) {
		
		String Body = "{\r\n"
				+ "    \"APIKey\": \"33bb7b1afd9355ef8641a23f0f3d57e7f1fb6a7d\",\r\n"
				+ "    \"PharmacyNumber\": \"1003906942\",\r\n"
				+ "    \"rx_number\": \"1891884\",\r\n"
				+ "    \"workflow_status\": \"7\",\r\n"
				+ "    \"workflow_status_text\": \"Transferred\"\r\n"
				+ "}";
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .when()
		   .body(Body)
		   .post("https://capi.stage.phil.us/api/bestrx/v1/prescriptions")
		   .then()
		   .log()
		   .body();
	}
	
}

