package com.black3.app.webdogapimvvm.data

import com.black3.app.webdogapimvvm.view_ui.model.Frutas

//Este es la fuente de datos, seria como el repositorio donde estará la información
class FrutasDataSet {

    fun crearListaDeFrutas():List<Frutas>{
        return listOf(
            Frutas("Manzana", "Rojo", 4.5F,2.0F),
            Frutas("Banano", "Amarillo", 2.5F,1.0F),
            Frutas("Uvas", "Verde", 3.5F,1.5F))
    }

}