package PageFactoryandTestData;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EMS_Locators {

	//======================================================ESP Web Login Locators======================================================//

		@FindBy(xpath="//input[contains(@id,'asilogin_AsiNumber')] | //input[contains(@id,'txtAsiNum')]")
		public WebElement ASINo;
		
		
		@FindBy(xpath="//input[contains(@id,'asilogin_UserName')] | //input[contains(@id,'txtUserName')]")
		public WebElement UserName;
		
		@FindBy(xpath="//input[contains(@id,'asilogin_Password')] | //input[contains(@id,'txtPassword')]")
		public WebElement Password;
		
		@FindBy(xpath="//input[contains(@id,'btnLogin')] | //input[contains(@value,'Login')]" )
		public WebElement LoginButton;
		
		@FindBy(xpath="//a[contains(@class,'appAreaLink')]")
		public String EspWeb_Link;
		
		@FindBy(xpath="//a[contains(text(),'Email Marketing')]")
		public String Email_Marketing_Tab_Wait;
		
	//==================================================ESP Login Locators=========================================================
		@FindBy(xpath="//input[contains(@id,'txtAsiNum')]")
		public WebElement EspASINo;
		
		@FindBy(id="txtUserName")
		public WebElement EspUserName;
		
		@FindBy(id="txtPassword")
		public WebElement EspPassword;
		
		@FindBy(xpath="//input[contains(@value,'Login')]")
		public WebElement EspLoginButton;

  //===========================================================Landing Main Page Locators=======================================//
		@FindBy(xpath="//a[contains(text(),'Web Home Page')]")
		public WebElement ESPWebHomePageLinkText;
		
		
		@FindBy(xpath="//*[contains(@translate,'NAVIGATION.EMAIL_MARKETING')]")
		public WebElement EmailMarketingTab;
		
		@FindBy(xpath="//h2[contains(text(),'Dashboard')]")
		public WebElement EmailMarketing_Dashboard;

  //=========================================================Campaigns Locators==================================================//
		@FindBy(xpath="//span[contains(text(),'Campaigns')]")
		public WebElement CampaignsTab;
		
		@FindBy(xpath="//span[contains(text(),'Dashboard')]")
		public WebElement DashboardTabs;
		
		@FindBy(xpath="//button[contains(@title,'Preview Campaign')]")
		public  WebElement CampaignPreviewButton;
		
		@FindBy(xpath="//div[contains(@translate,'EMARKETING.LABELS.DRAFT')]")
		public String CampaignDraftDisplay_Wait;
		
		@FindBy(xpath="//button[contains(@title,'Create a New Campaign')]")
		public WebElement CreateCampaignButton;
		
		@FindBy(id="campaignName")
		public WebElement CampaignName_Field;
		
		@FindBy(id="subjectLine")
		public WebElement SubjectLine_Field;

		@FindBy(id="FromName")
		public WebElement FromName_Field;

        @FindBy(xpath="//button[contains(@class,'btn btn-primary ems-btn-narrow ems-width-3-10 ng-scope')]")
        public WebElement CampaignNextStep_Button;
        
       @FindBy(xpath="//img[contains(@class,'img-responsive ems-width-full ng-isolate-scope')]")
       public String TemplatesDisplay_Wait;
        
        @FindBy(xpath="//img[contains(@class,'img-responsive ems-width-full ng-isolate-scope')]")
        public WebElement ExistingTemplate;
        
        @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[3]/a[1]")
        public WebElement ExistingTemplate_PreviewLink;
      
        @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[3]/a[2]")
        public WebElement ExistingTemplate_EditButton;
        
        @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[3]/a[3]")
        public WebElement ExistingTemplateDeleteButton;
        
        @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div[3]/a[4]")
        public WebElement ExistingTemplate_PublishUnpublish;
        
        @FindBy(xpath="//h3[contains(text(),'All Templates')]")
        public WebElement TemplatesStep_Verification;
        
        @FindBy(xpath="//span[contains(text(),'Templates')]")
        public WebElement TemplatesTab;
        
        @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[1]/div/a/span")
        public WebElement AllTemplatesFilter_Count;
        
        @FindBy(xpath="//b[contains(text(),'Blank Template')]")
        public WebElement ChooseTemplate_BlankTemplateButton;
        
        @FindBy(id="TemplateName")
        public WebElement TemplateName_InsertionField;
        
        @FindBy(xpath="//button[contains(@ng-click,'vm.submitForm(createTemplateForm)')]")
        public WebElement Template_CreateButton;
        
        @FindBy(xpath="//h2[contains(@class,'ems-color-gray padding-10 ng-binding')]")
        public WebElement EditorStep_Verification;
        
        @FindBy(xpath="//span[contains(@class,'h2 ems-color-gray padding-left-10 ng-binding')]")
        public WebElement TemplateCreation_FromTemplatePage_Verification;
        
        @FindBy(xpath="//button[contains(text(),'Save')]")
        public WebElement TemplateEditingPage_SaveButton;
        
        @FindBy(xpath="//tbody/tr/td")
        public WebElement TemplateCreate_PreviewVerification;
        
        @FindBy(xpath="//button[contains(@title,'Close')]")
        public WebElement ClosePreviewWindow;
        
        @FindBy(xpath="//button[contains(text(),'Preview')]")
        public WebElement TemplateEditingPage_PreviewButton;
        
        @FindBy(xpath="//input[contains(@ng-change,'searchTemplates')]")
        public WebElement SearchTemplate_Field;
        
       /* @FindBy(xpath="//div[contains(@class,'tile-row clearfix ng-scope')]/div/div[1]/div/div[3]//a[contains(text(),'Preview')]")
        public WebElement TemplateListHover;*/
        
        @FindBy(xpath="//img[contains(@class,'img-responsive ems-width-full ng-isolate-scope')]")
        public WebElement TemplateListHover;
        
        @FindBy(xpath="//tbody/tr/td/table/tbody/tr/td")
        public WebElement Editor_UploadImage_HtmlLink;
        
        /*@FindBy(xpath="//tbody/tr/td/div//img[contains(@ng-if,'htmlLink')]")
        public WebElement Editor_UploadImage_HtmlLink;*/

        @FindBy(xpath="//div[contains(@ngf-select,'uploadFiles')]")
        public WebElement Editor_ReplaceImage_Button;
        
        @FindBy(xpath="//img[contains(@src,'product.png')]")
        public WebElement Editor_ContentBlock_1Product;
        
        @FindBy(xpath="//tbody/tr/td/table/tbody/tr/td")
        public WebElement Editor_Product_DropArea;
        
        @FindBy(xpath="//uib-tab-heading[contains(@translate,'ORDERS.TABS.PRODUCT_SEARCH')]")
        public WebElement CampaignEditor_ProductSearchTab;
       
        @FindBy(xpath="//uib-tab-heading[contains(@translate,'ORDERS.TABS.PRODUCT_SEARCH')]")
        public String CampaignEditor_ProductSearchTab_Wait;
        
        @FindBy(xpath="//input[contains(@name,'keywords')]")
        public WebElement CampaignEditor_ProductSearchTab_SearchProductField;
        
        @FindBy(xpath="//button[contains(@class,'btn btn-success btn-block')]")
        public WebElement CampaignEditor_ProductSearchTab_SearchProductButton;
        
        @FindBy(css="body > div.modal.modal-wide.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div > div > div.tab-pane.ng-scope.active > div.grid.grid-5.row.ng-scope > div > div > div:nth-child(1) > div > div.media-left.prod-img > div > a > img")
        public WebElement CampaignEditor_ProductSearchTab_SearchProductSelection;
        
        @FindBy(css="body > div.modal.modal-wide.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div > div > div.tab-pane.ng-scope.active > div.grid.grid-5.row.ng-scope > div > div > div:nth-child(1) > div > div.media-left.prod-img > div > a > img")
        public String CampaignEditor_ProductSearchTab_SearchProductSelection_Wait;
        
        @FindBy(xpath="//button[contains(text(),'Add Product(s)')]")
        public WebElement ProductSearchTab_AddProduct_Button;
        
        @FindBy(xpath="//input[contains(@value,'Done Editing Product')]")
        public WebElement EditorPage_DoneEditing_Button;
        
        @FindBy(xpath="//input[contains(@value,'Done Editing Header')]")
        public WebElement EditorPage_DoneEditingImage_Button;
        
        @FindBy(xpath="//input[contains(@value,'Done Editing Button')]")
        public WebElement EditorPage_DoneEditing_URLButton;
        
        @FindBy(xpath="//h2[contains(text(),'Recipients')]")
        public WebElement EditorStepSuccessfull_Verification;
        
        @FindBy(xpath="//button[contains(@ng-click,'vm.saveTemplate')]")
        public WebElement SaveButton_Template;
        
        @FindBy(xpath="//button[contains(@class,'btn btn-sm btn-primary ems-btn-narrow ng-scope')]")
        public WebElement EditorStep_NextButton;
        
        @FindBy(xpath="//button[contains(@title,'Next Step: Send')]")
        public WebElement MoveToSendStep_NextButton;
        
        @FindBy(xpath="//button[contains(@title,'Create a New List')]")
        public WebElement Campaign_CreateListButton;
        
        @FindBy(xpath="//button[contains(@title,'Create a New List')]")
        public List<WebElement> ListButton_Verification_CampaignFlow;
        
        @FindBy(id="listName")
        public WebElement ListName_Field;
        
        @FindBy(xpath="//button[contains(text(),'Create')]")
        public WebElement List_CreateButton;
        
       @FindBy(xpath="//input[contains(@ng-model,'vm.quickContact')]")
       public WebElement AddContactsToList_Field;
       
       @FindBy(xpath="//button[contains(text(),'Add from CRM')]")
       public WebElement AddFromCRM_Contacts_Button;
       
       @FindBy(xpath="//input[contains(@ng-model,'searchTerm')]")
       public WebElement CRMSearchTerm;
       
       @FindBy(xpath="//input[@placeholder='Search']")
       public WebElement ListSearch;
       
       @FindBy(xpath="//button[@translate='BUTTONS.COPY']")
       public WebElement Copybutton;
       
       @FindBy(xpath="//a[contains(text(),'50 contacts Copy')]/parent::div")
       public WebElement CopiedList;
       
       @FindBy(xpath="//i[@class='fa fa-remove clear-btn clear-visible']")
       public WebElement ClearText;
       
       @FindBy(xpath="//div[contains(@class,'item-title white-space-pre word-break ng-binding')]")
       public WebElement CRMCompanyName_SelectionCheckbox;
       
       @FindBy(xpath="//a[contains(@class,'text-med ng-binding')]")
       public WebElement CRMContactEmailAddress;
       
       @FindBy(xpath="//button[contains(@ng-click,'addSelectedRecipients()')]")
       public WebElement CRMToEMS_ContactAddButton;
       
       @FindBy(xpath="//input[contains(@name,'listName')]")
       public WebElement ListCreationVerification;
       
       @FindBy(xpath="//button[contains(@title,'Delete List')]")
       public WebElement BulkDeleteButton_Lists;
       
       @FindBy(xpath="//input[contains(@ng-model,'record.chosen')]")
       public WebElement BulkListSelection;
       
       @FindBy(xpath="//a[contains(@ui-sref,'lists.detail')]")
       public WebElement BulkDeleteVerification;
       
       @FindBy(xpath="//tbody/tr[1]")
       public WebElement AddContactsFromCRM_UnderList_Verification_Row1;
       
       @FindBy(xpath="//tbody/tr[2]")
       public WebElement AddContactsFromCRM_UnderList_Verification_Row2;
       
       @FindBy(xpath="//table[contains(@class,'table table-bordered ng-table-responsive ems-table ems-table-222222 ng-scope ng-table')]")
       public WebElement ListContactsVerification;

       @FindBy(xpath="//ng-content[contains(@translate,'EMARKETING.BUTTONS.BACK_TO_CAMPAIGN')]")
       public WebElement BackToCampaignLink_AddListPage;
       
       @FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.BACK')]")
       public WebElement BackLink_ListNavigation;
       
       @FindBy(xpath="//input[contains(@ng-click,'selectItem')]")
       public WebElement ListSelectedByDefault_BackToCampaign;

       @FindBy(xpath="//button[contains(@title,'Preview Your Template')][contains(@class,'btn btn-default ems-btn-narrow margin-left-5')]")
       public WebElement SendCampaign_PreviewButton;
       
       @FindBy(xpath="//a[contains(@ng-click,'vm.showRecipientsList')]")
       public WebElement CampaignRecipient_ListPreview_DetailsLink;
       
       @FindBy(xpath="//button[contains(@translate,'EMARKETING.BUTTONS.DONE')]")
       public WebElement CampaignRecipientPreview_DoneButton;
       
       @FindBy(xpath="//span[contains(@translate,'EMARKETING.CAMPAIGNS.RECIPIENTS')]")
       public WebElement CampaignListPreview_VisibleVerification;
       
       @FindBy(xpath="//tbody/tr/td")
       public WebElement CampaignPreview_Verification;
       
       @FindBy(xpath="//input[contains(@ng-model,'vmsc.data.testRecipient')]")
       public WebElement SendTestEmail_TextField;
       
       @FindBy(xpath="//button[contains(@ng-click,'sendTest')]")
       public WebElement SendTestEmail_SendButton;
       
       @FindBy(xpath="//div[contains(@class,'toast-message')]")
       public WebElement SendEmailTest_Veriifcation;
       
       @FindBy(xpath="//div[contains(@class,'toast-title')]")
       public WebElement DeleteTemplate_Veriifcation;
       
       @FindBy(xpath="//button[contains(text(),'Save & Close')]")
       public WebElement SaveandCloseCampaign_Button;
       
       @FindBy(xpath="//h2[contains(@class,'ems-color-gray')]")
       public WebElement CampaignPage_Verification;
       
       @FindBy(xpath="//input[contains(@ng-model,'TermsAndConditionsChecked')]")
       public WebElement SendStep_TermsandCondition_Checkbox;
       
       @FindBy(xpath="//button[contains(@title,'Send Your Email')]")
       public WebElement SendMail_Button;
       
       
       @FindBy(xpath="//h3[contains(@class,'ems-color-gray ng-binding')]")
       public WebElement CampaignName;
       
       
       
       //=======================================================Copy And Move Contacts Locators=====================================//
       
       @FindBy(xpath="//input[contains(@ng-click,'vm.changeCheckCount')]")
       public WebElement ListContact_CheckboxSelection;
       
       @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[5]/div/table/tbody/tr[1]/td[2]")
       public WebElement ListContactEmail;
       
       @FindBy(xpath="//button[contains(@class,'btn btn-default dropdown-toggle margin-left-10')]")
       public WebElement List_ActionButton;
       
       @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[3]/div/ul/li[1]/ul/li[1]/a")
       public WebElement MoveToList_Name_ActionDropdown;
     
       @FindBy(xpath="//a[contains(@translate,'MOVE_TO_LIST')]")
       public WebElement MoveToList_ActionOption;
       
       @FindBy(xpath="//a[contains(@translate,'COPY_TO_LIST')]")
       public WebElement CopyToList_ActionOption;
       
       @FindBy(xpath="//span[contains(text(),'Lists')]")
       public WebElement ListTab;
       
       @FindBy(xpath="//input[contains(@ng-model,'vm.searchTerm')]")
       public WebElement ListSearchField;
       
       @FindBy(xpath="//input[contains(@ng-model,'vm.searchTermRecpList')]")
       public WebElement CampaignLevel_Searchfield;
       
       @FindBy(xpath="//a[contains(@ui-sref,'lists.detail')]")
       public WebElement ListDetails;
       
       @FindBy(xpath="//*[@id='pad-wrapper']/div[4]/div[5]/div/table/tbody/tr[1]/td[2]")
       public WebElement ListDetails_MoveContactsVerification;
       
       @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[3]/div/ul/li[2]/ul/li[1]/a")
       public WebElement ContactsUnderlist_CopyToContactName;
       
       @FindBy(xpath="//button[contains(text(),'Delete')]")
       public WebElement Contacts_DeleteButton;
       
       @FindBy(xpath="//button[contains(text(),'Yes')]")
       public WebElement DeleteContact_ConfirmButton;
       
       @FindBy(xpath="//div[contains(@class,'toast-title')]")
       public WebElement DeleteContact_Verification;
       
      @FindBy(xpath="//button[contains(@title,'Create a New List')]")
      public WebElement CreateListButton_ListPage;
      
      @FindBy(xpath="//button[contains(text(),'Copy')]")
      public WebElement CopyButton_ListManagementPage;
      
      @FindBy(xpath="//button[contains(@ng-click,'deleteList')][contains(@class,'btn ems-color-midgray ems-background-lightgray ems-btn-inline')]")
      public WebElement DeleteListButton_ListManagementPage;
      
      @FindBy(xpath="//button[contains(@ng-click,'showAddContactModal')][contains(@class,'btn ems-color-midgray ems-background-lightgray ems-btn-inline')]")
      public WebElement AddIndivisualContactButton_ListManagementPage;
      
      @FindBy(xpath="//input[contains(@ng-model,'contact.GivenName')]")
      public WebElement GivenFirstNameField_IndivisualContact;
      
      @FindBy(xpath="//input[contains(@ng-model,'contact.FamilyName')]")
      public WebElement GivenLastNameField_IndivisualContact;
      
      @FindBy(xpath="//input[contains(@ng-model,'contact.Emails')]")
      public WebElement GivenEmailField_IndivisualContact;
      
      @FindBy(xpath="//button[contains(text(),'Save')]")
      public WebElement IndivisualContactSaveButton;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[2]/div/div/table/tbody/tr/td[3]")
      public WebElement ReceipientCountColumn_ListManagementPage;
      
      @FindBy(xpath="//span[contains(@translate,'SELECT_LIST_CAMPAIGN_MSG')]")
      public WebElement RecipientsList_CampaignStep_TextVerification;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[5]/div[2]/div[1]/div[2]/div[1]/span[1]")
      public WebElement RecepientCount;
      
      @FindBy(xpath="//button[contains(text(),'Import File')]")
      public WebElement ImportFile;
      
      @FindBy(xpath="//button[contains(text(),'CSV')]")
      public WebElement ImportFileCSV;
     
      @FindBy(xpath="//div[contains(@class,'btn btn-sm btn-default ems-import-file-container pull-right ems-width-full')]")
      public WebElement SelectfileCSV;
      
      @FindBy(xpath="//strong[contains(text(),'Upload')]/parent::button")
      public WebElement Uploadfile;
      
      @FindBy(xpath="//button[contains(text(),'Contact Email Home')]")
      public WebElement mapcontacts;
      
      @FindBy(xpath="//button[contains(@ng-click,'vm.completeImport(vm.selectedFields)')]")
      public WebElement ImportComplete;
      
      @FindBy(xpath="//label/input[contains(@type,'checkbox')]")
      public WebElement importcheckbox;
      
      @FindBy(xpath="//span[contains(text(),'Email Address')]")
      public WebElement EmailAddress;
      
      @FindBy(xpath="//button[contains(text(),'Unsubscribe Reports')]")
      public WebElement Campaign_UnsubscribeReports_Button;
       
      @FindBy(xpath="//span[contains(text(),'Dashboard')]")
      public WebElement DashboardTab;
      
      @FindBy(xpath="//ng-content[contains(text(),'Export All Reports')]")
      public WebElement ExportAllReport_Link;
      
      @FindBy(xpath="//div[contains(@class,'ems-shadowbox ems-min-height-250 padding-10')]//div[contains(@class,'row padding-left-5')]/div[3]//span[contains(@ng-if,'SENT')]/following::div[1]/div/button")
      public WebElement Dashboard_CampaignExportButton;
      
      @FindBy(xpath="//div[contains(@class,'ems-shadowbox ems-min-height-250 padding-10')]//div[contains(@class,'row padding-left-5')]/div[3]//span[contains(@ng-if,'SENT')]/following::div[1]/div/button/following::ul[1]/li//a[contains(text(),'Summary Report')]")
      public WebElement Campaign_SummaryReport;
   
      @FindBy(xpath="//div[contains(@class,'ems-shadowbox ems-min-height-250 padding-10')]//div[contains(@class,'row padding-left-5')]/div[3]//span[contains(@ng-if,'SENT')]/following::div[1]/div/button/following::ul[1]/li[2]//a[contains(text(),'Detail Report')]")
      public WebElement Campaign_DetailReport;
      
      @FindBy(xpath="//h5[contains(text(),'Recently Sent Campaigns')]")
      public WebElement Recentlysentcampaigns;
      
      @FindBy(xpath="//div[contains(@class,'row padding-top-20 padding-bot-20')][2]/div[2]/div[1]/div[3]/button")
      public WebElement CopyButton_RecentCampaignSent;
      

      @FindBy(xpath="//button[contains(text(),'Ok')]")
      public WebElement CreateCopyCampaign_Button;
      
      @FindBy(xpath="//button[contains(text(),'Copy')]")
      public WebElement RecentDraftCopyButton;
      
      @FindBy(xpath="//button[contains(text(),'Delete')]")
      public WebElement RecentDraft_DeleteButton;
      
      @FindBy(xpath="//button[contains(text(),'Yes')]")
      public WebElement DraftDelete_Confirm;
      
      @FindBy(xpath="//div[contains(@class,'block-ui-overlay')]')]")
      public WebElement Spinner;
      
      @FindBy(xpath="//div[contains(text(),'Loading')][contains(@class,'block-ui-message ng-binding')]")
      public WebElement Spinner2;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/h3")
      public WebElement test;
      
      @FindBy(xpath="//button[contains(@title,'Edit Subject')]")
      public WebElement EditSubjectButton_SendStep;
      
      @FindBy(xpath="//input[contains(@id,'name')]")
      public WebElement SubjectNameField_Sendstep;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div[2]/form/div/div[1]/div[2]/div[1]/button[1]")
      public WebElement SubjectSaveButton_SendStep;
      
      @FindBy(xpath="//button[contains(@title,'Edit List')]")
      public WebElement EditListButton_SendStep;
      
      @FindBy(xpath="//input[contains(@ng-click,'selectItem')]")
      public WebElement ListSelection_WhileEditing;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div[2]/form/div/div[2]/div[2]/div[1]/button[1]")
      public WebElement ListSaveButton_SendStep;
      
      @FindBy(xpath="//button[contains(@title,'Edit From Name')]")
      public WebElement EditFromNameButton_SendStep;
      
      @FindBy(xpath="//input[contains(@id,'fromname')]")
      public WebElement FromNameField_Sendstep;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div[2]/form/div/div[3]/div[2]/div[1]/button[1]")
      public WebElement FromNameSaveButton;
      
      @FindBy(xpath="//button[contains(@title,'Edit Reply-to Email')]")
      public WebElement EditReplyToButton_SendStep;
      
      @FindBy(xpath="//input[contains(@id,'fromemail')]")
      public WebElement FromEmailField_Sendstep;
      
      @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div[2]/form/div/div[4]/div[2]/div[1]/button[1]")
      public WebElement ReplyToButton_SendStep;
      
      @FindBy(xpath="//input[contains(@value,'Schedule Email')]")
      public WebElement ScheduleEmail_SendStep_RadioButton;
      
      @FindBy(xpath="//button[contains(@title,'Send Your Scheduled Email')]")
      public WebElement SendScheduleCampaignButton;
      
      @FindBy(xpath="//div[contains(@translate,'EMARKETING.CAMPAIGNS.SCHEDULED')]")
      public WebElement ScheduledCampaign_Verification;
      
      @FindBy(xpath="//ng-content[contains(@translate,'EMARKETING.BUTTONS.CANCEL_SEND')]")
      public WebElement CancelScheduledCampaignSend;
      
      @FindBy(xpath="//h4[contains(@translate,'EMARKETING.CAMPAIGNS.SEND_STEP.DELIVERY')]")
      public String DeliverySendPage_TextDisplay_Wait;
      //===============================================Settings Locators==============================================//
      @FindBy(xpath="//span[contains(text(),'Settings')]")
      public WebElement SettingsTab;
      
      @FindBy(xpath="//a[contains(text(),'Company Settings')]")
      public WebElement Settings_CompanySettings;
      
      @FindBy(xpath="//input[contains(@name,'phone')]")
      public WebElement CompanySettings_PhoneField;
      
      @FindBy(xpath="//input[contains(@ng-model,'address.Line1')]")
      public WebElement CompanySettings_Address1;
      
      @FindBy(xpath="//input[contains(@ng-model,'address.PostalCode')]")
      public WebElement CompanySettings_PostalCode;
      
      @FindBy(xpath="//button[contains(@type,'submit')]")
      public WebElement CompanySettings_SaveButton;
      
      @FindBy(xpath="//p[contains(text(),'New York, New York, NY')]")
      public WebElement CompanyAddressVerification_Campaign;
      
      @FindBy(xpath="//p[contains(text(),'Are you sure you want to leave without saving your changes?')]")
      public WebElement WithoutSavingSettings_WhileMovingToOtherTab_AlertVerification;
      
      @FindBy(xpath="//button[contains(text(),'Cancel')]")
      public WebElement AlertCancelButton;
      
      @FindBy(xpath="//button[contains(text(),'Ok')]")
      public WebElement AlertOkButton;
      
      @FindBy(xpath="//input[contains(@ng-model,'settings.fromName')]")
      public WebElement Settings_FromName_Field;
      
      @FindBy(xpath="//input[contains(@ng-model,'settings.htmlLink')]")
      public WebElement HTMLLink_CompanySettings;
      
      @FindBy(xpath="//input[contains(@ng-model,'settings.address.City')]")
      public WebElement City_CompanySettings;
      
      @FindBy(name= "companyName")
      public WebElement Companyname;
      
      @FindBy(xpath="//button[contains(text(),'Preview')][2]")
      public WebElement previewtemplate;
      
      @FindBy(xpath="//a[contains(text(),'To unsubscribe from AIA Corporation 800 Winneconne Ave , Neenah, WI 54956 US mailings, please click here.')]")
      public WebElement unsubscribetext;
     //==============================================Corporate Locators=====================================//
     @FindBy(xpath="//input[contains(@value,'General')]")
     public WebElement MyTemplates_TemplatesRadioButton;
     
     @FindBy(xpath="//input[contains(@value,'Corporate')]")
     public WebElement CorporateTemplates_TemplatesRadioButton;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[9]/div/a/span")
     public WebElement CorporateTemplateFilterCount;
     
     @FindBy(xpath="//a[contains(@id,'userInfo')]")
     public WebElement UserInfo_Gravter;
     
     @FindBy(xpath="//a[contains(@href,'import')]")
     public WebElement CRM_SettingsOption;
     
     @FindBy(xpath="//a[contains(text(),'CRM Data Access')]")
     public WebElement CRM_Settings_DataAccessOption;
   
     @FindBy(xpath="//input[contains(@checked,'checked')]")
     public List<WebElement> CRM_Settings_DataAccessOption1;
     
     @FindBy(xpath="//label[contains(@ng-click,'vm.switch()')]")
     public WebElement Allow_AIA_AccessSwitch;
     
     @FindBy(xpath="//input[contains(@checked,'checked')]")
     public List<WebElement> AIA_Switch_ON_ToggleVerification;
     
     @FindBy(xpath="//input[contains(@ng-checked,'vm.ngModel')]")
     public WebElement AIA_Switch_OFF_ToggleVerification;
     
     @FindBy(xpath="//select[contains(@onchange,'switchTenant')]")
     public WebElement UserInfo_SwitchTenent_Dropdown;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[10]/div/a/span")
     public WebElement MyTemplateFilterCount;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[9]/div/a/span")
     public WebElement MyTemplateFilterCountChild;
     
     @FindBy(xpath="//button[contains(text(),'Cancel')]")
     public WebElement CancelButton_EditTemplate;
     
     @FindBy(xpath="//a[contains(text(),'Logout')]")
     public WebElement UserInfo_Logout;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[8]/div/a/span")
     public WebElement UserTemplateFilter_Corporate;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[1]/div/div[1]/div/a/span")
     public WebElement AllTemplatesFilter;
     
     @FindBy(xpath="//span[contains(text(),'Corporate Templates')]")
     public WebElement CorporateTemplatesFilter;

     @FindBy(xpath="//span[contains(text(),'Categories')]")
     public WebElement CategoriesFilter;
     
     @FindBy(xpath="//a[contains(@class,'template-option ems-z-550 ng-binding')]")
     public WebElement ShareWithUser_TemplateLink_Corporate;
     
     @FindBy(xpath="//a[contains(text(),'Hide from Users')][contains(@class,'template-option ems-z-550 ng-binding')]")
     public WebElement HideFromUser_TemplateLink_Corporate;
     
     @FindBy(xpath="//a[contains(text(),'Preview')]")
     public WebElement PreviewTemplate_TemplateListing;
     
     @FindBy(xpath="//a[contains(text(),'Get Started')]")
     public WebElement TemplateListing_GetStarted;
     
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[2]/span")
     public WebElement TemplateNameGet;
     
     @FindBy(xpath="//span[contains(text(),'Supplier Flyers')][contains(@class,'label-heading ng-scope ng-binding')]")
     public WebElement SupplierFlyerFilter;
     
     @FindBy(xpath="//a[contains(text(),'Corporate Settings')]")
     public WebElement CorporateSettings_SettingsTab;
     
     @FindBy(xpath="//select[contains(@name,'defaultTemplateView')]")
     public WebElement DefaultTemplateDropdown_Settings;
     
    
     @FindBy(xpath="//*[4][contains(@class,'col-xs-12')]/div[1]//div[contains(@class,'ems-onoffswitch')]//input[contains(@class,'ems-onoffswitch-checkbox ng-pristine ng-untouched ng-valid ng-not-empty')]")
     public WebElement SupplierFlyerToggleStatusON;
     
     @FindBy(xpath="//*[4][contains(@class,'col-xs-12')]/div[1]//div[contains(@class,'ems-onoffswitch')]//input[contains(@class,'ems-onoffswitch-checkbox ng-pristine ng-untouched ng-valid ng-empty')]")
     public WebElement SupplierFlyerToggleStatusOFF;
     
     @FindBy(xpath="//*[4][contains(@class,'col-xs-12')]/div[2]//div[contains(@class,'ems-onoffswitch')]//input[contains(@class,'ems-onoffswitch-checkbox ng-pristine ng-untouched ng-valid ng-not-empty')]")
     public WebElement RankingFlyerToggleStatusON;
     
     @FindBy(xpath="//*[4][contains(@class,'col-xs-12')]/div[2]//div[contains(@class,'ems-onoffswitch')]//input[contains(@class,'ems-onoffswitch-checkbox ng-pristine ng-untouched ng-valid ng-empty')]")
     public WebElement RankingFlyerToggleStatusOFF;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div[4]/div[1]/div/label/span[2]")
     public WebElement SupplierFlyerToggleClick;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div[4]/div[2]/div/label/span[2]")
     public WebElement RankingToggleClick;
    
     @FindBy(xpath="//*[@id='pad-wrapper']/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[2]/span")
     public WebElement childSuppliertemplateText;
     
     @FindBy(xpath="//button[contains(text(),'Save')]")
     public WebElement CorporateSaveButton_SettingsCorporate;
     
     @FindBy(xpath="//h3[contains(text(),'My Templates')]")
     public WebElement DefaultTemplateChangeVerification_OnTemplatesScreen;
     
     @FindBy(xpath="//button[contains(@ng-click,'AddSupplierModal')]")
     public WebElement AddSupplierButton_Settings;
     
     @FindBy(xpath="//span[contains(text(),'Enter or Select Supplier')]")
     public WebElement SupplierAddField;
     
     @FindBy(xpath="//div[contains(@class,'ems-cmodal-item ng-binding ng-scope')]")
     public WebElement SupplierSelection;
     
     @FindBy(xpath="//input[contains(@placeholder,'Enter or Select Supplier')]")
     public WebElement SupplierInputField_Settings;
     
     @FindBy(xpath="//span[contains(@ng-bind,'sup.Name')]")
     public WebElement SupplierNameCheck_SupplierAddPopup;
     
     @FindBy(xpath="//input[contains(@placeholder,'Search')]")
     public WebElement SearchSupplier;
     
     @FindBy(xpath="//input[contains(@ng-model,'s.Checked')]")
     public WebElement CheckedSupplierCheckbox;
     
     @FindBy(xpath="//button[contains(@ng-click,'deletePrefSupplier')]")
     public WebElement DeleteSupplierButton;
     
     @FindBy(xpath="//button[contains(text(),'Yes')]")
     public WebElement DeleteConfirmButton;
     
     @FindBy(xpath="//button[contains(@ng-click,'submitForm')]")
     public WebElement SupplierAddButton;
     
     @FindBy(xpath="//input[contains(@ng-model,'UnsubscribeText')]")
     public WebElement UnsubscribeBlockText_Field;
     
     @FindBy(xpath="//p[contains(text(),'NON AIA COMPANY')]")
     public WebElement UnsubscribeBlockText_Verification;
     
     @FindBy(xpath="//a[contains(text(),'Preview')]")
     public WebElement HoverPreview;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div/div[2]/div/div[2]/div/form/div[2]/div[2]/div[4]/div[2]/div/label/span[2]")
     public WebElement RankingToggleClick_Prod;
     
     @FindBy(xpath="//*[@class='builder-element ng-scope selected']/ng-include/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td")
     public WebElement ProductAlign_Right_Verification;
     
     @FindBy(xpath="//*[@class='builder-element ng-scope selected']/ng-include/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td")
     public WebElement ProductAlign_Left_Verification;
     
     @FindBy(xpath="//*[@class='builder-element ng-scope selected']/ng-include/table/tbody/tr/td/table/tbody/tr[1]/td")
     public WebElement ProductAlign_Above_Verification;
     
     @FindBy(xpath="//*[@class='builder-element ng-scope selected']/ng-include/table/tbody/tr/td/table/tbody/tr[2]/td")
     public WebElement ProductAlign_Below_Verification;
     
     @FindBy(xpath="//button[contains(text(),'Left')]")
     public WebElement ProductAlignment_LeftButton;
     
     @FindBy(xpath="//button[contains(text(),'Right')]")
     public WebElement ProductAlignment_RightButton;
     
     @FindBy(xpath="//button[contains(text(),'Below')]")
     public WebElement ProductAlignment_BelowButton;
     
     @FindBy(xpath="//button[contains(text(),'Above')]")
     public WebElement ProductAlignment_AboveButton;
     
     //=============================================Dynamic List Locators=====================================================//
     @FindBy(xpath="//label[contains(@for,'dynamicList')]")
     public WebElement DynamicList_CheckBox;
     
     @FindBy(css="span[translate='EMARKETING.LISTS.ADD_NEW_RULE']")
     public WebElement AddNewRule_Link;
     
     @FindBy(xpath="//select[contains(@ng-model,'rule.Filter')]")
     public WebElement RuleFilter_Dropdown;
     
     @FindBy(xpath="//input[contains(@placeholder,'Enter Individual Name')]")
     public WebElement RuleFilterRecordOwner_IndivisualNameField;
     
     @FindBy(xpath="//button[contains(@translate,'PREVIEW_LIST')]")
     public WebElement PreviewList_Dynamic;
     
     @FindBy(xpath="//table[contains(@ng-table,'vm.pListsTableParams')]")
     public WebElement PreviewDetails_Verification;
     
     @FindBy(xpath="//button[contains(@translate,'BUTTONS.SAVE')]")
     public WebElement DynamicList_SaveButton;
     
     @FindBy(xpath="//span[contains(@class,'ems-dynamic-image ng-binding')]")
     public WebElement DynamicListName_DynamicText_Verification_AfterSaving;
     
     @FindBy(xpath="//td[contains(@data-title-text,'Recipients')]")
     public WebElement DynamicList_RecipientText_Verification_AfterSaving;
     
     //===========================================Corporate Campaign Locators=================================================//
     @FindBy(xpath="//ng-content[contains(@translate,'EMARKETING.LABELS.MERGE_CAMPAIGN')]")
     public WebElement MergeCamapaign_RadioOption;
     
     @FindBy(xpath="//a[contains(@translate,'RESTORE_DEFAULT')]")
     public WebElement RestoreDefaults_FromField_MergeCampaign;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.htmlLink')]")
     public WebElement HtmlLinkField_Campaign_EditorStep;
     
     @FindBy(xpath="//a[contains(@ng-click,'setMergeFieldDefault')][contains(@ng-click,'Logo')]")
     public WebElement RestoreDefault_Logo_EditorStep;
     
     @FindBy(xpath="//uib-tab-heading[contains(@translate,'EMARKETING.TEMPLATES.LABELS.TEXT')]")
     public WebElement Header_TextTab_EditorStep;
     
     @FindBy(xpath="//a[contains(@href,'*|DEFAULT_WEBSITE|*')]")
     public WebElement TextField_EditorStep;
     
     @FindBy(xpath="//a[contains(@ng-click,'setMergeFieldDefault')][contains(@ng-click,'Text')]")
     public WebElement RestoreDefault_Text_EditorStep;
     
     @FindBy(xpath="//uib-tab-heading[contains(@translate,'EMARKETING.TEMPLATES.LABELS.SOCIAL')]")
     public WebElement Header_SocialTab_EditorStep;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.facebookLink')]")
     public WebElement FacebookLink_Field_Social_EditorStep;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.twitterLink')]")
     public WebElement Twitter_Field_Social_EditorStep;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.instagramLink')]")
     public WebElement Instagram_Field_Social_EditorStep;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.linkedinLink')]")
     public WebElement Linkedin_Field_Social_EditorStep;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.pinterestLink')]")
     public WebElement Pinterest_Field_Social_EditorStep;
     
     @FindBy(xpath="//a[contains(@ng-click,'setMergeFieldDefault')][contains(@ng-click,'Social')]")
     public WebElement RestoreDefault_Social_EditorStep;
     
     @FindBy(xpath="//span[contains(text(),'Enter or Select Company')]")
     public WebElement ListDetails_CompanySelection_Field;
     
     @FindBy(xpath="//input[contains(@placeholder,'Enter or Select Company')]")
     public WebElement SelectCompany_TextField_List;
     
     @FindBy(xpath="//span[(@class='ng-binding')]")
     public WebElement CompanySelection;
     
     @FindBy(xpath="//p[contains(@class,'ems-dynamic-text ng-scope')]")
     public WebElement DynamicListText;
     
     @FindBy(xpath="//input[contains(@ng-model,'searchTerm')]")
     public WebElement CRMSearchContact_Field;
     
     @FindBy(xpath="//li[2][contains(@class,'list-item-no-padding clearfix ng-scope')]/div[2]/div[2]/div[1]/div[1]/div[contains(@class,'item-title white-space-pre word-break ng-binding')]")
     public WebElement Contact2Selection_CRMContacts;
     
     @FindBy(xpath="//ng-content[contains(@translate,'EMARKETING.BUTTONS.BACK_TO_CAMPAIGN')]")
     public WebElement BackToCampaign_Merge;
     
     @FindBy(xpath="//span[contains(text(),'asi/109480 AIA Corporation 3., asi/444012 MACPAK Pakistan')]")
     public WebElement SendStep_SendMailDrop_WithMultipleTenentSelection_VerificationStage;
     
     @FindBy(xpath="//span[contains(text(),'asi/109480 AIA Corporation, asi/444012 My Corporate Expressions')]")
     public WebElement SendStep_SendMailDrop_WithMultipleTenentSelection_Verificationuat;
     
    //asi/109480 AIA Corporation Company, asi/444012 AIA/My Corporate Expressions
     
     @FindBy(xpath="//span[contains(text(),'asi/320879 AIA Corporate Production Testing  Mirror Company., asi/320880 AIA OWNER A Production Testing Company')]")
     public WebElement SendStep_SendMailDrop_WithMultipleTenentSelection_VerificationProd;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]/div/a")
     public WebElement ListDetails_Listing;
     
     @FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.ACTIONS')]")
     public List<WebElement> ActionButton;
     
     @FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.BACK')]")
     public WebElement List_BackLink;
     
     @FindBy(xpath="//button[contains(@translate,'BUTTONS.CANCEL')][contains(@ng-show,'currentStepNumber()!=3&&currentStepNumber()!=5')]")
     public WebElement Button_Cancel_TemplateWhileCampaign;
     
    
     @FindBy(xpath="//input[contains(@placeholder,'Search')]")
     public WebElement SearchCampaign_CampaignTab;
     
     @FindBy(xpath="//a[contains(@ng-click,'goCampaignDetail')]")
     public WebElement CampaignDetails;
     
     @FindBy(xpath="//input[contains(@placeholder,'http://')]")
     public WebElement Https_Hyperlink_RestoreDefault_Verification;
     
     @FindBy(xpath="//span[contains(@translate,'EMARKETING.LISTS.ADD_CONTACTS_TO_LIST_NOTOWNER_MSG')]")
     public WebElement ListContactMessage_WithoutImportButton;
     
     @FindBy(xpath="//img[contains(@src,'button.png')]")
     public WebElement LinkToUrlButton_ContentBlock;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.url')]")
     public WebElement LinkToURLButton_URLField;
     
     @FindBy(xpath="//input[contains(@ng-model,'currentElement.options.buttonText')]")
     public WebElement LinkToUrlButton_ButtonTextField;
     
     @FindBy(xpath="//div[contains(@data-ng-bind-html,'element.options.vmlString')]")
     public WebElement Templates_ButtonText_Verification;
     
     @FindBy(xpath="//p[contains(@ng-bind-html,'vm.message')]")
     public WebElement LinkToTheUrlButton_PopUpVerification_Campaign;
     
     @FindBy(xpath="//p[contains(@ng-bind-html,'vm.message')]")
     public List<WebElement> LinkToTheUrlButton_PopUpVerification_MergeCampaign;
     
     @FindBy(xpath="//button[contains(@translate,'BUTTONS.OK')]")
     public WebElement LinkToURLButton_PopUpMessage_OKButton;
     
     @FindBy(xpath="//button[contains(@title,'Preview Your Template')][contains(@class,'btn btn-default ems-btn-narrow margin-left-5 ng-scope')]")
     public WebElement SendStep_PreviewButton;
     
     @FindBy(xpath="//select[contains(@ng-change,'vm.tenantChange()')]")
     //@FindBy(xpath="//select-multiple[contains(@on-change,'vmsc.data.tenantsSelectionChange()')]")
     public WebElement TenentSelection_Preview_MergeCampaign;
     
     @FindBy(xpath="//div[contains(@translate,'EMARKETING.LABELS.PROCESSING')]")
     public WebElement CampaignProcessing_Status;
     //================================================CRM Locators==============================================================//
    
     @FindBy(xpath="//ng-content[contains(text(),'CRM')]")
     public WebElement CRM_Tab;
     
     @FindBy(xpath="//a[contains(@title,'Contacts')]")
     public WebElement CRM_ContactsTab;
     
     @FindBy(xpath="//h4[contains(text(),'Email Marketing Lists')]")
     public WebElement EmailMarketing_Lists_Heading_CRM;
     
     @FindBy(xpath="//*[@id='pad-wrapper']/div[3]/div[1]/div[2]/ems-list/div/div[2]/div[2]/ul/li[1]/a/span")
     public WebElement ListSelection_CRM;
     
     @FindBy(xpath="//input[contains(@placeholder,'Search for address, phone, etc.')]")
     public WebElement SearchContactField_CRM;
     
     //================================================AdManagement Corporate Settings Locators=======================================//
     @FindBy(xpath="//a[contains(text(),'Ad Management')]")
     public WebElement Settings_AdmanagementLink;
     
     @FindBy(xpath="//span[contains(text(),'Create Ad')]")
     public WebElement Admanagement_CreateAd_Button;
     
     @FindBy(xpath="//input[contains(@ng-model,'ad.Name')]")
     public WebElement CreateAd_NameField;
     
     @FindBy(xpath="//ng-content[contains(text(),'Upload File')]")
     public WebElement CreateAd_UploadFile_Button;
     
     @FindBy(xpath="//button[contains(text(),'Remove Image')]")
     public WebElement RemoveImage_Button;
     
     @FindBy(xpath="//div[contains(@name,'ngFileUpload')]")
     public WebElement AdImageRemove_Verification;
     
     
     
     @FindBy(xpath="//p[contains(@class,'ng-binding ellipsis margin-bot-20 margin-top-10')]")
     public WebElement AdImageUpload_Verification;
     
     @FindBy(xpath="//input[contains(@name,'Advertiser')]")
     public WebElement CreateAd_AdvertiserField;
     
     @FindBy(xpath="//textarea[contains(@ng-model,'ad.Description')]")
     public WebElement CreateAd_DescriptionTextArea;
     
     @FindBy(xpath="//input[contains(@ng-model,'ad.BannerExternalURL')]")
     public WebElement CreateAd_BannerURLField;
     
     @FindBy(xpath="//input[contains(@name,'StartDate')]")
     public WebElement CreateAd_StartDateField;
     
     @FindBy(xpath="//span[contains(@ng-click,'startDateOpen')]")
     public WebElement CreateAdStartDate_DatePickerIcon;
     
     @FindBy(xpath="//span[contains(@ng-click,'endDateOpen')]")
     public WebElement  CreateAdEndDate_DatePickerIcon;    
    
     @FindBy(xpath="//i[contains(@ng-style,'AdStatus')]")
     public WebElement Ad_Status_ChangeDropdown;
     
     @FindBy(xpath="//a[contains(@ng-click,'ad.AdStatus')]")
     public WebElement CreateAd_StatusSelection;
     
     @FindBy(xpath="//input[contains(@ng-model,'searchTerm')]")
     public WebElement SearchAddField;
     
     @FindBy(xpath="//input[contains(@ng-model,'record.chosen')]")
     public WebElement NewAdCreated_Verification_AdmanagementPage;
     
     @FindBy(xpath="//button[contains(@translate-attr,'DELETE_AD')]")
     public WebElement AdManagementPage_DeleteButton;
     
     @FindBy(xpath="//button[contains(@translate,'BUTTONS.YES')]")
     public WebElement Ad_DeleteConfirm;
     
     @FindBy(xpath="//td[contains(@translate,'EMARKETING.LABELS.NO_RESULTS_FOUND')]")
     public WebElement DeleteAdd_SuccessfullVerification;
     
     @FindBy(xpath="//a[contains(@ng-click,'createEditAd')]")
     public WebElement AdPage_AddedRecordDetails_Link;
     
     @FindBy(css="i[style='color: rgb(0, 136, 0);']")
     public WebElement ActiveAd_Verification;
     
     @FindBy(css="i[style='color: rgb(169, 68, 66);']")
     public WebElement InactiveAd_Verification;
     
     @FindBy(xpath="//td[contains(@class,'ng-binding')]")
     public WebElement AdvertiserDetails_AdList_Verification;
     
     }
