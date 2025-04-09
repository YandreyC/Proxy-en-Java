package Proxy;

public class Main {
    public static void main(String[] args) {
        Documento doc1 = new DocumentoProxy("admin", "Informe confidencial de ventas");
        doc1.mostrarContenido();

        Documento doc2 = new DocumentoProxy("invitado", "Informe confidencial de ventas");
        doc2.mostrarContenido();
    }
}