package br.com.mastertech.hometeacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Home Teacher</title>\n" +
                "    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"header\">\n" +
                "        <h1>\n" +
                "            <a href=\"index.html\">Home Teacher</a>\n" +
                "        </h1>\n" +
                "\n" +
                "        <div class=\"menu\">\n" +
                "            <a href=\"produtos.html\">Produtos</a>\n" +
                "            <a href=\"sobre.html\">Sobre</a>\n" +
                "            <a href=\"contato.html\">Contato</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class= \"banner\" src=\"https://images.unsplash.com/photo-1556302132-40bb13638500?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1355&q=80\" alt=\"\">\n" +
                "</body>\n" +
                "</html>";
    }
    @GetMapping("/styles.css")
    public String mostrarEStilo(){
        return "body{\n" +
                "    margin: 0;\n" +
                "    font-family: sans-serif;\n" +
                "}\n" +
                "\n" +
                "a{\n" +
                "    color: white;\n" +
                "    text-decoration: none;\n" +
                "}\n" +
                "\n" +
                "form{\n" +
                "    width: 50%;\n" +
                "    margin: auto;\n" +
                "}\n" +
                "\n" +
                "input{\n" +
                "    display: block;\n" +
                "    width: 100%;\n" +
                "    padding: 10px;\n" +
                "    margin: 5px 0;\n" +
                "}\n" +
                ".menu a{\n" +
                "    font-size: 20px;\n" +
                "    padding: 0 10px;\n" +
                "}\n" +
                "\n" +
                ".header{\n" +
                "    background-color: rgb(94, 1, 1);\n" +
                "    overflow: auto;\n" +
                "    color: white;\n" +
                "    display: flex;\n" +
                "    align-items: center;\n" +
                "    justify-content: space-between;\n" +
                "    padding: 10px;\n" +
                "}\n" +
                ".banner{\n" +
                "    width: 100%;\n" +
                "}\n" +
                "\n" +
                ".products{\n" +
                "    display: flex;\n" +
                "    justify-content: space-around;\n" +
                "}\n" +
                "\n" +
                ".products div{\n" +
                "    width: 30%;\n" +
                "    text-align: center;\n" +
                "}\n" +
                "\n" +
                ".products img{\n" +
                "    width: 100%;\n" +
                "    border-radius: 15px;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n";
    }
}
