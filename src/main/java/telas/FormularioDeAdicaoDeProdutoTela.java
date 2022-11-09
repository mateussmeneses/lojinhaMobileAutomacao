package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoDeProdutoTela extends BaseTela {

    public FormularioDeAdicaoDeProdutoTela(WebDriver app) {
        super(app);
    }

    public FormularioDeAdicaoDeProdutoTela preencherNomeProduto(String produtoNome){
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);

        return this;
    }
    public FormularioDeAdicaoDeProdutoTela preencherValorProduto(String produtoValor){
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoValor);

        return this;

    }
    public FormularioDeAdicaoDeProdutoTela preencherCorProduto(String produtoCor){
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoCor);
        return this;

    }
    public FormularioDeAdicaoDeProdutoTela submissaoComError(){
        app.findElement(By.id("com.lojinha:id/saveButton")).click();

        return this;
    }
    public String obterMensagemDeErro(){
         return   capturarToast();
    }
}
