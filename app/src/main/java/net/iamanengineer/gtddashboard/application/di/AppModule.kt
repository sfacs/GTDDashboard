package net.iamanengineer.gtddashboard.application.di

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.iamanengineer.gtddashboard.BuildConfig
import net.iamanengineer.gtddashboard.data.remote.NotionService
import net.iamanengineer.gtddashboard.models.notion.moshiadapters.NotionPageListJsonAdapter
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesNotionRetrofit(moshi: Moshi, okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(BuildConfig.NOTION_BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build();


    @Singleton
    @Provides
    fun providesMoshi(): Moshi = Moshi.Builder()
        .add(NotionPageListJsonAdapter())
        .build()

    @Singleton
    @Provides
    fun providesNotionService(retrofit: Retrofit): NotionService = retrofit.create(NotionService::class.java)

    @Singleton
    @Provides
    fun providesOkHttp(): OkHttpClient = OkHttpClient.Builder().addInterceptor {
            val newRequest = it.request ().newBuilder()
                .addHeader("Authorization", "Bearer " + BuildConfig.NOTION_TOKEN)
                .addHeader("Notion-Version", "2021-08-16")
                .build();
            it.proceed(newRequest);
    }.build();

}