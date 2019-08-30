package com.black3.app.webdogapimvvm.domain

import com.black3.app.webdogapimvvm.data.FrutasDataSet
import com.black3.app.webdogapimvvm.view_ui.model.Frutas

//Acá obtendremos la lista o datos que tiene el repositorio
class FrutasUseCase {

    private val frutasDataSet = FrutasDataSet()

    fun obtenerListaDeFrutas(): List<Frutas> {
        return frutasDataSet.crearListaDeFrutas()
    }
}