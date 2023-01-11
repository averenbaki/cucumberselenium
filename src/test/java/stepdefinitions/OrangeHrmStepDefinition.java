package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.OrangeHRMLoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHrmStepDefinition {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }

    @When("kullanici valid credentials girer")
    public void kullaniciValidCredentialsGirer(DataTable table) {

       /*
       //List Methodu ile table parçalama

       List<List<String>> data=table.asLists();
        for (List<String> satir:data) {
            for (String hucre:satir){
                System.out.println(hucre+"-");
            }
            System.out.println();*/

       /*
       //hücre ve sütun ile çağırma

        String username=table.cell(1,0);
        String password=table.cell(1,1);
        System.out.println(username+" "+password);*/

        /*
        //tüm hücre ve sütunları gezebilecek şekilde

        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());
        int rowCount=table.height();//satır sayısı
        int colCount=table.width();//sütun sayısı

        for (int i=1;i<rowCount;i++)//ilk bölüm data olmadığından dahil etmek istemedik ve 1 den başlattık
        {
            for (int j=0;j<colCount;j++){
                System.out.println(table.cell(i, j));
            }
        }
        */

        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());

        List<Map<String,String>> data =table.asMaps(String.class,String.class);
        for (Map<String,String> maps:data) {
            String userid=maps.get("admin_id");
            String userpassword=maps.get("admin_pass");

            lp.typeUsername(userid);
            lp.typePassword(userpassword);
            lp.clickLogin();
            System.out.println(maps);
        }


        }

    @When("kullanici invalid credentials girer")
    public void kullaniciInvalidCredentialsGirer(DataTable table) {
        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());

        List<List<String>> data=table.asLists();
        for (int row=1;row<table.height();row++){//rowları döner
           String username=table.cell(row,0);
           String password=table.cell(row,1);
           String errMessage=table.cell(row,2);

            lp.typeUsername(username);
            lp.typePassword(password);
            lp.clickLogin();
            lp.verifyErrorMessageContains(errMessage);

        }




    }
}

