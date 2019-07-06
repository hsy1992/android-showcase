package com.igorwojda.lastfm

import android.os.Bundle
import com.igorwojda.lastfm.feature.album.presentation.albumsearch.AlbumSearchActivity
import com.igorwojda.lastfm.feature.base.presentation.activity.BaseContainerActivity

class MainContainerActivity : BaseContainerActivity() {
    override val layoutResourceId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(AlbumSearchActivity.newIntent(this))
    }
}