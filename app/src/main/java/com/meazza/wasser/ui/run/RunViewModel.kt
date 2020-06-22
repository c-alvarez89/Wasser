package com.meazza.wasser.ui.run

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.meazza.wasser.data.repository.RunRepository

class RunViewModel @ViewModelInject constructor(
    private val runRepository: RunRepository
) : ViewModel() {


}