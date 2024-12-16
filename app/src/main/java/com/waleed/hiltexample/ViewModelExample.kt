package com.waleed.hiltexample

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelExample @Inject constructor() : ViewModel() {
}