package com.github.snuffix.android.appzumi.data.repository

import com.github.snuffix.android.appzumi.data.model.RepositoryEntity
import io.reactivex.Flowable

interface RepositoryRemoteSource {
    fun getRepositories(): Flowable<List<RepositoryEntity>>
}
