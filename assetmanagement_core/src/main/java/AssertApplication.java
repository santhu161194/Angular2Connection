import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.medplus.assetmanagementcore.dao.AssetDao;
import com.medplus.assetmanagementcore.dao.impl.AssetDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;


public class AssertApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/medplus/assetmanagementcore/utils/ApplicationContext.xml");
AssetDaoImpl assertdao= context.getBean("assetdaoimpl",AssetDaoImpl.class);
Asset asset=context.getBean(Asset.class);
asset.setAssetId(12240);
asset.setSerialNumber("44");
asset.setAssetName("lenovo");
asset.setAssetType(AssetTypeEnum.Laptop);
asset.setCost(15000.00);
asset.setStatus(AssetStatusEnum.Available);
int rows=assertdao.addAsset( asset);
if(rows>0)
	System.out.println("inserted");
else
System.out.println("not inserted");
/*
int rows=assertdao.updateAssetCost(12228);
if(rows>0)
	System.out.println("updated");
else
	System.out.println("not updated");
	}*/

}
}