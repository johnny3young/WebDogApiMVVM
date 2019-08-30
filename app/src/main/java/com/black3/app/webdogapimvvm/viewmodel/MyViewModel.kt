package com.black3.app.webdogapimvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.black3.app.webdogapimvvm.domain.FrutasUseCase
import com.black3.app.webdogapimvvm.view_ui.model.Frutas

class MyViewModel: ViewModel() {

    val frutasUseCase = FrutasUseCase ()
    private val listData = MutableLiveData<List<Frutas>>()

    init {
        getListaFrutas()
    }

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }
    //Se podría usar Coroutines (Corutinas) para pedir información asyncrona
    fun getListaFrutas(){
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }
    //LiveData estará pendiente si la lista de frutas cambia y realizar alguna acción
    fun getListFrutasLiveData (): LiveData<List<Frutas>>{
        return listData
    }

}