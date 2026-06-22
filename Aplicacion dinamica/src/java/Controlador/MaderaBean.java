/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Madera;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MaderaBean")
@ViewScoped
public class MaderaBean {

    private List<Madera> listaMaderas;
    
    private Madera nuevaMadera = new Madera();
    
    public List<Madera> getListaMaderas() {
        return listaMaderas;
    }
    public MaderaBean() {
    }

    @PostConstruct
    public void init() {
        listaMaderas = new ArrayList<>();
        cargarMaderas();
    }

    public void cargarMaderas() {
        listaMaderas = new ArrayList<>();

        listaMaderas.add(new Madera(1, "Caoba", "Fina",
                "Marrón oscuro", 120, true));

        listaMaderas.add(new Madera(2, "Pino", "Blanda",
                "Beige", 45, true));

        listaMaderas.add(new Madera(3, "Cedro", "Aromática",
                "Rojizo", 95, false));

        listaMaderas.add(new Madera(4, "Roble", "Dura",
                "Marrón claro", 150, true));

        listaMaderas.add(new Madera(5, "Nogal", "Premium",
                "Café oscuro", 180, false));
    }

}