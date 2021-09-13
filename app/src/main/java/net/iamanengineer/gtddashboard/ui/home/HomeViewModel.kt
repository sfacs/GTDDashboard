package net.iamanengineer.gtddashboard.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import net.iamanengineer.gtddashboard.data.remote.NetworkDataSource
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val networkDataSource: NetworkDataSource): ViewModel() {
    fun getTodayTodo() {
        viewModelScope.launch {
            // TODO Move this into repository
            networkDataSource.getTodoToday().collect { pages ->
                pages.map { page ->
                    val task = page.properties?.name?.title?.get(0)?.plainText
                    Log.i("Julien" , task!!)
                }
            }
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}