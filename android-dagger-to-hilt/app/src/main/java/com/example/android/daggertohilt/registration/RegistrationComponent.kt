package com.example.android.daggertohilt.registration

import com.example.android.daggertohilt.di.ActivityScope
import com.example.android.daggertohilt.registration.enterdetails.EnterDetailsFragment
import com.example.android.daggertohilt.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}