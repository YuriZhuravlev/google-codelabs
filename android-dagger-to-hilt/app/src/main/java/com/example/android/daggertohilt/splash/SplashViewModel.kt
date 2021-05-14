package com.example.android.daggertohilt.splash

import com.example.android.daggertohilt.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(val userManager: UserManager)