package com.medplus.assetmanagement.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.service.impl.AssetServiceImpl;
import com.medplus.assetmanagementcore.utils.AppConfig;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class AddAssetTset {
	@Autowired
	AssetServiceImpl assetServiceImpl;

	@Test
	public void testAddAssetSuccess() {
		Asset asset = new Asset();

		// AssetDaoImpl daoImpl=new AssetDaoImpl();
		asset.setAssetId(12233);
		asset.setSerialNumber("18");
		asset.setAssetName("hp");
		asset.setAssetType(AssetTypeEnum.Laptop);
		asset.setCost(15000.00);
		asset.setStatus(AssetStatusEnum.Available);
		String expectedResult = "SUCCESS";
		/*assertEquals(expectedResult, assetServiceImpl.addAsset(asset));*/

	}
	/*@Test
	public void testUpdateAssetName()
	{
		
		String expectedResult = "SUCCESS";
		assertEquals(expectedResult, assetServiceImpl.updateAssetName(12230));
	}
	@Test
	public void testUpdateAssetCost()
	{
		
		String expectedResult = "SUCCESS";
		assertEquals(expectedResult, assetServiceImpl.updateAssetCost(12230));
	}
	@Test
	public void testUpdateAssetStatus()
	{
		
		String expectedResult = "SUCCESS";
		assertEquals(expectedResult, assetServiceImpl.updateAssetStatus(12230));
	}*/

}