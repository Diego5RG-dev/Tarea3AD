import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class xml {
    private static final String XML_FILE = "autores.xml";

    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter(XML_FILE));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("autores");

            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", "a1");

            writer.writeStartElement("nome");
            writer.writeCharacters("Alexandre Dumas");
            writer.writeEndElement();

            writer.writeStartElement("titulo");
            writer.writeCharacters("El conde de Montecristo");
            writer.writeCharacters("Los miserables");
            writer.writeEndElement();

            writer.writeEndElement(); // Fin del autor

            writer.writeStartElement("autor");
            writer.writeAttribute("codigo", "a2");

            writer.writeStartElement("nome");
            writer.writeCharacters("Fiodor Dostoyevski");
            writer.writeEndElement();

            writer.writeStartElement("titulo");
            writer.writeCharacters("El idiota");
            writer.writeCharacters("Noches Blancas");
            writer.writeEndElement();

            writer.writeEndElement(); // Fin del autor
            writer.writeEndElement(); // Fin de autores

            writer.flush();
            writer.close();

            System.out.println("Archivo XML creado exitosamente: " + XML_FILE);
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }


}
