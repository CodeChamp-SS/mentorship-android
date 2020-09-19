package org.systers.mentorship.viewmodels.providers

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.systers.mentorship.repository.DbRepository
import org.systers.mentorship.viewmodels.ProfileViewModel

class ProfileViewModelProvider(val app: Application, val repo: DbRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T{
        return ProfileViewModel(app, repo) as T
    }
}