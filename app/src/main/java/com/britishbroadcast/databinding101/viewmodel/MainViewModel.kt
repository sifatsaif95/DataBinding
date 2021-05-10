package com.britishbroadcast.databinding101.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.britishbroadcast.databinding101.BR
import java.util.logging.Handler

class MainViewModel: BaseObservable() {


    @get: Bindable
    var econTopic: String = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.econTopic)
    }



    fun changeTopic(){
        //imagine this being called from an api call...

        econTopic = "The New Book of Finances.."


    }

}