package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListagemDeProdutosTela extends BaseTela {


    public ListagemDeProdutosTela(WebDriver app) {
        super(app);
    }

    public FormularioDeAdicaoDeProdutoTela abrirTelaAdicaoProduto(){
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new FormularioDeAdicaoDeProdutoTela(app);

    }

    }

