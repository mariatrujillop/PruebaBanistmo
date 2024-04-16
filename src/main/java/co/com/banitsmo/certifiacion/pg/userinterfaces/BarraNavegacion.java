package co.com.banitsmo.certifiacion.pg.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BarraNavegacion {

    public static final Target ACEPTAR_AVISO = Target.the("Aceptar aviso").
            located(By.xpath("//*[@id='btn-aceptar-cookies']/strong"));


    public static final Target PRODUCTOS_Y_SERVICIOS = Target.the("productos y servicios").
            located(By.xpath("//*[@id='navbar-collapse-grid']/ul/li[3]/a"));

    public static final Target DEPOSITOS = Target.the("Depositos").
            located(By.xpath("//*[@id='navbar-collapse-grid']/ul/li[3]/ul/li/div[1]/ul[1]/li[1]/a"));

    public static final Target CUENTA_AHORRO_COMERCIAL = Target.the("Cuenta ahorro comercial").
            located(By.xpath("//*[@id='none']/div/div/div[2]/div[2]/div/div[2]/h2/a"));

    public static final Target DOCUMENTOS = Target.the("Documentos").
            located(By.xpath("//*[@id='filialTabs']/li[5]/a"));

    public static final Target DESCARGAR_PDF = Target.the("Descargar PDF").
            located(By.xpath("//*[@id='tab5']/table/tbody/tr/td[2]/a/img"));




}