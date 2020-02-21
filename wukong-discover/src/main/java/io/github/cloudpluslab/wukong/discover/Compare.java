/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong.discover;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class Compare {

	public final static List<String> whitlist = new ArrayList<String>();
	
	static {
		whitlist.add("createinstancerequest");
		whitlist.add("deleterouterinterfacerequest");
		whitlist.add("describeinstancetypefamiliesrequest");
		whitlist.add("describeregionsrequest");
		whitlist.add("describeinstanceramrolerequest");
		whitlist.add("terminatephysicalconnectionrequest");
		whitlist.add("cancelautosnapshotpolicyrequest");
		whitlist.add("deletesecuritygrouprequest");
		whitlist.add("describenatgatewaysrequest");
		whitlist.add("describesnapshotsrequest");
		whitlist.add("recovervirtualborderrouterrequest");
		whitlist.add("eipfillproductrequest");
		whitlist.add("bindiprangerequest");
		whitlist.add("modifyhavipattributerequest");
		whitlist.add("describeiprangesrequest");
		whitlist.add("modifysecuritygroupattributerequest");
		whitlist.add("resizediskrequest");
		whitlist.add("deletebandwidthpackagerequest");
		whitlist.add("describelimitationrequest");
		whitlist.add("createvirtualborderrouterrequest");
		whitlist.add("modifyinstanceautorenewattributerequest");
		whitlist.add("describeinstanceautorenewattributerequest");
		whitlist.add("describenewprojecteipmonitordatarequest");
		whitlist.add("importkeypairrequest");
		whitlist.add("modifyvswitchattributerequest");
		whitlist.add("connectrouterinterfacerequest");
		whitlist.add("terminatevirtualborderrouterrequest");
		whitlist.add("modifyimagesharegrouppermissionrequest");
		whitlist.add("modifyinstanceattributerequest");
		whitlist.add("createsecuritygrouprequest");
		whitlist.add("authorizesecuritygrouprequest");
		whitlist.add("createvpcrequest");
		whitlist.add("modifyinstancespecrequest");
		whitlist.add("describevirtualborderroutersrequest");
		whitlist.add("revokesecuritygrouprequest");
		whitlist.add("modifyinstancevncpasswdrequest");
		whitlist.add("describeinstancemonitordatarequest");
		whitlist.add("createforwardentryrequest");
		whitlist.add("addbandwidthpackageipsrequest");
		whitlist.add("commonrpcrequest");
		whitlist.add("modifyautosnapshotpolicyexrequest");
		whitlist.add("detachdiskrequest");
		whitlist.add("describediskmonitordatarequest");
		whitlist.add("importimagerequest");
		whitlist.add("describeinstancetypesrequest");
		whitlist.add("describeinstancephysicalattributerequest");
		whitlist.add("leavesecuritygrouprequest");
		whitlist.add("deleteinstancerequest");
		whitlist.add("eipnotifypaidrequest");
		whitlist.add("modifyautosnapshotpolicyrequest");
		whitlist.add("deleteimagerequest");
		whitlist.add("describeimagesharepermissionrequest");
		whitlist.add("replacesystemdiskrequest");
		whitlist.add("describeimagesupportinstancetypesrequest");
		whitlist.add("describetagsrequest");
		whitlist.add("createautosnapshotpolicyrequest");
		whitlist.add("unbindiprangerequest");
		whitlist.add("describebandwidthpackagesrequest");
		whitlist.add("startinstancerequest");
		whitlist.add("describeinstancevncurlrequest");
		whitlist.add("deletenatgatewayrequest");
		whitlist.add("addtagsrequest");
		whitlist.add("createnatgatewayrequest");
		whitlist.add("allocatepublicipaddressrequest");
		whitlist.add("enablephysicalconnectionrequest");
		whitlist.add("describeeipmonitordatarequest");
		whitlist.add("detachinstanceramrolerequest");
		whitlist.add("describekeypairsrequest");
		whitlist.add("describeimagesrequest");
		whitlist.add("describerouterinterfacesrequest");
		whitlist.add("exportimagerequest");
		whitlist.add("joinsecuritygrouprequest");
		whitlist.add("activaterouterinterfacerequest");
		whitlist.add("modifyimagesharepermissionrequest");
		whitlist.add("authorizesecuritygroupegressrequest");
		whitlist.add("describevirtualborderroutersforphysicalconnectionrequest");
		whitlist.add("describephysicalconnectionsrequest");
		whitlist.add("creatediskrequest");
		whitlist.add("describetasksrequest");
		whitlist.add("describeendpointsrequest");
		whitlist.add("deletehaviprequest");
		whitlist.add("describehavipsrequest");
		whitlist.add("describevswitchesrequest");
		whitlist.add("canceltaskrequest");
		whitlist.add("modifyvrouterattributerequest");
		whitlist.add("describesecuritygroupsrequest");
		whitlist.add("deletevirtualborderrouterrequest");
		whitlist.add("deletevswitchrequest");
		whitlist.add("applyautosnapshotpolicyrequest");
		whitlist.add("describeautosnapshotpolicyrequest");
		whitlist.add("removebandwidthpackageipsrequest");
		whitlist.add("modifybandwidthpackagespecrequest");
		whitlist.add("modifysnapshotattributerequest");
		whitlist.add("describesnapshotlinksrequest");
		whitlist.add("associatehaviprequest");
		whitlist.add("revokesecuritygroupegressrequest");
		whitlist.add("createimagerequest");
		whitlist.add("describeclustersrequest");
		whitlist.add("createphysicalconnectionrequest");
		whitlist.add("allocateeipaddressrequest");
		whitlist.add("releasepublicipaddressrequest");
		whitlist.add("describeinstancesrequest");
		whitlist.add("describedisksrequest");
		whitlist.add("describeeipaddressesrequest");
		whitlist.add("removetagsrequest");
		whitlist.add("describeintranetattributekbrequest");
		whitlist.add("modifyphysicalconnectionattributerequest");
		whitlist.add("associateeipaddressrequest");
		whitlist.add("deleterouteentryrequest");
		whitlist.add("modifyforwardentryrequest");
		whitlist.add("describeroutetablesrequest");
		whitlist.add("deletediskrequest");
		whitlist.add("createvswitchrequest");
		whitlist.add("assumerolerequest");
		whitlist.add("modifyrouterinterfaceattributerequest");
		whitlist.add("describetagkeysrequest");
		whitlist.add("deleteautosnapshotpolicyrequest");
		whitlist.add("describevroutersrequest");
		whitlist.add("describeautosnapshotpolicyexrequest");
		whitlist.add("describeforwardtableentriesrequest");
		whitlist.add("createhaviprequest");
		whitlist.add("getsessionaccesskeyrequest");
		whitlist.add("deletephysicalconnectionrequest");
		whitlist.add("cancelcopyimagerequest");
		whitlist.add("attachkeypairrequest");
		whitlist.add("deletevpcrequest");
		whitlist.add("modifyinstancenetworkspecrequest");
		whitlist.add("modifyinstanceautoreleasetimerequest");
		whitlist.add("unassociateeipaddressrequest");
		whitlist.add("describesecuritygroupattributerequest");
		whitlist.add("unassociatehaviprequest");
		whitlist.add("describeuserdatarequest");
		whitlist.add("modifydiskattributerequest");
		whitlist.add("describeresourcebytagsrequest");
		whitlist.add("copyimagerequest");
		whitlist.add("commonroarequest");
		whitlist.add("modifyeipaddressattributerequest");
		whitlist.add("detachkeypairrequest");
		whitlist.add("reinitdiskrequest");
		whitlist.add("attachdiskrequest");
		whitlist.add("modifyintranetbandwidthkbrequest");
		whitlist.add("createkeypairrequest");
		whitlist.add("attachinstanceramrolerequest");
		whitlist.add("describeaccesspointsrequest");
		whitlist.add("deleteforwardentryrequest");
		whitlist.add("modifyinstancevpcattributerequest");
		whitlist.add("checkautosnapshotpolicyrequest");
		whitlist.add("eipfillparamsrequest");
		whitlist.add("deactivaterouterinterfacerequest");
		whitlist.add("modifyrouterinterfacespecrequest");
		whitlist.add("rebootinstancerequest");
		whitlist.add("deletekeypairsrequest");
		whitlist.add("modifyvirtualborderrouterattributerequest");
		whitlist.add("cancelphysicalconnectionrequest");
		whitlist.add("createsnapshotrequest");
		whitlist.add("describeinstancestatusrequest");
		whitlist.add("stopinstancerequest");
		whitlist.add("modifyimageattributerequest");
		whitlist.add("describeinstancevncpasswdrequest");
		whitlist.add("describevpcsrequest");
		whitlist.add("describezonesrequest");
		whitlist.add("renewinstancerequest");
		whitlist.add("deletesnapshotrequest");
		whitlist.add("releaseeipaddressrequest");
		whitlist.add("describetaskattributerequest");
		whitlist.add("checkdiskenableautosnapshotvalidationrequest");
		whitlist.add("createrouteentryrequest");
		whitlist.add("modifyvpcattributerequest");
		whitlist.add("describeinstanceattributerequest");
		whitlist.add("resetdiskrequest");
		whitlist.add("createrouterinterfacerequest");
	}
	

	public static void main(String[] args) throws Exception {
		List<JSONObject> jobjs = new ArrayList<JSONObject>();
		String line = null;
		BufferedReader br = new BufferedReader(new FileReader("test"));
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null) {
			if (line.equals("---") && sb.length() != 0) {
				jobjs.add(JSON.parseObject(sb.toString()));
				sb = new StringBuffer();
			} else if (!line.equals("---")) {
				sb.append(line).append("\n");
			} 
		}
		
		for (String name : whitlist) {
			for (JSONObject obj : jobjs) {
				if (obj.getJSONObject("metadata").getString("name").equals(name)) {
					System.out.println("---");
					System.out.println(JSON.toJSONString(obj, true));
					System.out.println("---");
				}
			}
		}
	}
}
