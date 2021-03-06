package com.project.mvvmrecipeapp.di

import com.project.mvvmrecipeapp.network.RecipeService
import com.project.mvvmrecipeapp.network.model.RecipeDtoMapper
import com.project.mvvmrecipeapp.repository.RecipeRepository
import com.project.mvvmrecipeapp.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeMapper: RecipeDtoMapper,
    ): RecipeRepository {
        return RecipeRepository_Impl(
            recipeService = recipeService,
            mapper = recipeMapper
        )
    }
}
