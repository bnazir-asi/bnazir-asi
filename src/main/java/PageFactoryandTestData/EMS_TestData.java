package PageFactoryandTestData;

import java.util.Random;

public class EMS_TestData {


	//============================================Application URL========================================================================//	
    public static String CRMandOrders_URL="https://espweb.uat-asicentral.com";


//============================================Browser Path=========================================================================//
    public static String sChromePath = "Installation/chromedriver.exe";
    public static String sFirefoxPath = "Installation/geckodriver.exe";
	public static String sIEPath = "Installation/IEDriverServer.exe";
	public static String sEdgePath = "Installation/MicrosoftWebDriver.exe";
	public static String sOperaPath = "Installation/operadriver.exe";
//=================================================Application All Environments Credentials==========================================//
    public static String ASINo="101574";
    public static String Username="prod_ems";
    public static String Password="pakistan1235@";
    
  //====================================================Corporate Credentials======================================================//
    public static String ASINo_Corp="109480";
    public static String Username_Corp="bilal_corps";
    public static String Password_Corp="bilal.1234";
    
    /*public static String ASINo_Corp="109480";
    public static String Username_Corp="109480bk";
    public static String Password_Corp="pakistan123@";*/
   /* public static String ASINo_Corp="109480";
    public static String Username_Corp="asi109480";
    public static String Password_Corp="password2";*/
    
 //=====================================================Non Admin child Credentials===============================================//
    public static String ASINo_NonAdmin="444514";
    public static String Username_NonAdmin="bilal_child_nonadmins1";
    public static String Password_NonAdmin="bilal.1234";
    
  //=====================================================Admin child Credentials=================================================//
   
    public static String ASINo_Adminchild="444514";
    public static String Username_Adminchild="bilal_childusers1";
    public static String Password_NonAdminchild="bilal.1234";
    
  /*  public static String ASINo_Adminchild="444012";
    public static String Username_Adminchild="bilal_childusers";
    public static String Password_NonAdminchild="bilal.1234";*/
    
   /* public static String ASINo_Adminchild="604667";
    public static String Username_Adminchild="or604667";
    public static String Password_NonAdminchild="prodvelo2";*/
    
 //=======================================================Prod Corporate Credentials==============================================//   
    public static String ASINo_ProdCorpMirror="320879";
    public static String Username_ProdCorpMirror="or320879";
    public static String Password_ProdCorpMirror="prodvelo2";
    
    public static String ASINo_ProdCorp="125737";
    public static String Username_ProdCorp="bilal_corp";
    public static String Password_ProdCorp="bilal.1234";
    
  //================================================Non Admin child Credentials=================================================//
    public static String ASINo_ProdNonAdmin="125739";
    public static String Username_ProdNonAdmin="bilal_child_nonadmin";
    public static String Password_ProdNonAdmin="bilal.1234";
    
  //================================================Non Admin child Credentials=================================================//
    public static String ASINo_ProdAdmin="125738";
    public static String Username_ProdAdmin="bilal_childuser";
    public static String Password_ProdAdmin="bilal.1234";

//=========================================Random Number Generation=============================================================//
    static Random rn = new Random();
	static Random ch = new Random();
	static int sRandam = rn.nextInt(100000) + 1;
	static char schar = (char)(ch.nextInt(26) + 'a');

    public static String AdManagementName=("AdManagement Ad-" +sRandam);
    
    public static String AdManagementUpdated=("Updated AdManagement Ad-" +sRandam);
	
	public static String CampaignName = (" EMS Campaign" +sRandam +schar);
	
	public static String CampaignNameCompanySettings = (" EMS Campaign Company Settings" +sRandam +schar);
	
	public static String MergeCampaignName = (" EMS Merge Campaign" +sRandam +schar);
	
	public static String MergeCampaignList_Verify = (" EMS Merge Campaign List Verify" +sRandam +schar);
	
	public static String CampaignNames = (" EMS Settings" +sRandam +schar);
	
	public static String CampaignNameDashboard = (" EMS Campaign Dashboard" +sRandam +schar);

	public static String TemplateName = (" EMS Template" +sRandam +schar);
	
	public static String MergeCampaignTemplateName = (" EMS Template Merge Campaign" +sRandam +schar);
	
	public static String MyTemplateName = (" EMS My Template" +sRandam +schar);
	
	public static String MyTemplateNameChild = (" EMS My Template Child" +sRandam +schar);
	
	public static String MyTemplateNonAdminChild = (" EMS My Template NonAdmin Child" +sRandam +schar);
	
	public static String TemplateNames = (" EMS Settings" +sRandam +schar);
	
	public static String TemplateNameFromTemplates = (" EMS Template" +sRandam);
	
	public static String GetStartedCorporateTemplate = (" Get Started Corporate Template" +sRandam);
	
	public static String ListName = (" EMS List" +sRandam +schar);
	
	public static String ImportListName = ("Import EMS List" +sRandam +schar);
	
	public static String ListNameSettings = (" EMS List Settings" +sRandam +schar);
	
	public static String ListNameFromListPage = (" EMS Dynamic List" +schar+sRandam);
	
	public static String MergeListAuth = ("Merge List Auth" +""+sRandam);
	
	public static String OwnerList = ("EMS List Owner" +schar+sRandam);
	
	public static String EMS_TestMergeCampaignList = (" EMS List Merge Campaign" +schar);
	
	public static String IndivisualContactEmailAddress = (" Contact@" +schar+".com");
	
	public static String OrderProduct="Cybertool M Swiss Army Knife";

//============================================Download Path========================================================================//	
	public static String user=System.getProperty("user.name");
	
	public static String downloadPath = "C:\\Users\\"+user+"\\Downloads";
}
