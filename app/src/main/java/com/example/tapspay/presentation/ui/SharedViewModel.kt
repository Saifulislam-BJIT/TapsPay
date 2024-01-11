package com.example.tapspay.presentation.ui

import androidx.lifecycle.ViewModel
import com.example.tapspay.domain.model.state.SharedState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel(){
    private val _state = MutableStateFlow(SharedState())
    val state = _state
}