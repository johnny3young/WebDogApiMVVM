package com.black3.app.webdogapimvvm.view_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.black3.app.webdogapimvvm.R
import com.black3.app.webdogapimvvm.view_ui.model.Frutas
import com.black3.app.webdogapimvvm.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    //Instanciamos MyViewmodel y suscribirnos al cambio que el liveData puede dar
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Para no crear una interfaz, creamos un observer a esa información y la instancia de ViewModel
        //Esta instancia permanecerá igual cada vez que abran el OnCreate a no ser que se destruya con un "finish"
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        //Acá me suscribo (cómo observo) para que me notifique el método GetListaFrutasLiveData que obtuvo la lista y se la va a dar al UI
        val frutasObserver = Observer<List<Frutas>> {
            for (fruta in it){
                Log.w("Frutas: ", "Las frutas de la lista son: ${fruta.nombreFruta}")
                //Log.w("frutas: ", it.toString())
            }
        }

        //Observamos el cambio de la lista de frutas
        viewModel.getListFrutasLiveData().observe(this, frutasObserver)
    }
}
