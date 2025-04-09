package Proxy;

public class DocumentoProxy implements Documento {
    private DocumentoReal documentoReal;
    private String usuario;

    public DocumentoProxy(String usuario, String contenido) {
        this.usuario = usuario;
        this.documentoReal = new DocumentoReal(contenido);
    }

    @Override
    public void mostrarContenido() {
        if (usuario.equalsIgnoreCase("admin")) {
            documentoReal.mostrarContenido();
        } else {
            System.out.println("Acceso denegado. Solo los administradores pueden ver el documento.");
        }
    }
}