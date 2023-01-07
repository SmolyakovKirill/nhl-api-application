package com.example.minnesotawild

import Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.minnesotawild.model.Team
import retrofit2.Response

class MainViewModel: ViewModel() {
    var repo = Repository()
    var myTeamItem: MutableLiveData<Response<Team>> = MutableLiveData()

    fun getTeamInfromation(){

    }
}