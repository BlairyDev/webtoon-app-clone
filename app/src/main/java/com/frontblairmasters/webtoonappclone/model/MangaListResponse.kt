package com.frontblairmasters.webtoonappclone.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MangaListResponse(
    @Json(name = "data")
    val `data`: List<Data>,
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "offset")
    val offset: Int,
    @Json(name = "response")
    val response: String,
    @Json(name = "result")
    val result: String,
    @Json(name = "total")
    val total: Int
) {
    @JsonClass(generateAdapter = true)
    data class Data(
        @Json(name = "attributes")
        val attributes: Attributes,
        @Json(name = "id")
        val id: String,
        @Json(name = "relationships")
        val relationships: List<Relationship>,
        @Json(name = "type")
        val type: String
    ) {
        @JsonClass(generateAdapter = true)
        data class Attributes(
            @Json(name = "altTitles")
            val altTitles: List<AltTitle>,
            @Json(name = "availableTranslatedLanguages")
            val availableTranslatedLanguages: List<String>,
            @Json(name = "chapterNumbersResetOnNewVolume")
            val chapterNumbersResetOnNewVolume: Boolean,
            @Json(name = "contentRating")
            val contentRating: String,
            @Json(name = "createdAt")
            val createdAt: String,
            @Json(name = "description")
            val description: Description,
            @Json(name = "isLocked")
            val isLocked: Boolean,
            @Json(name = "lastChapter")
            val lastChapter: String?,
            @Json(name = "lastVolume")
            val lastVolume: String?,
            @Json(name = "latestUploadedChapter")
            val latestUploadedChapter: String,
            @Json(name = "links")
            val links: Links,
            @Json(name = "originalLanguage")
            val originalLanguage: String,
            @Json(name = "publicationDemographic")
            val publicationDemographic: String?,
            @Json(name = "state")
            val state: String,
            @Json(name = "status")
            val status: String,
            @Json(name = "tags")
            val tags: List<Tag>,
            @Json(name = "title")
            val title: Title,
            @Json(name = "updatedAt")
            val updatedAt: String,
            @Json(name = "version")
            val version: Int,
            @Json(name = "year")
            val year: Int
        ) {
            @JsonClass(generateAdapter = true)
            data class AltTitle(
                @Json(name = "ar")
                val ar: String?,
                @Json(name = "en")
                val en: String?,
                @Json(name = "es")
                val es: String?,
                @Json(name = "es-la")
                val esLa: String?,
                @Json(name = "ja")
                val ja: String?,
                @Json(name = "ja-ro")
                val jaRo: String?,
                @Json(name = "ko")
                val ko: String?,
                @Json(name = "pt-br")
                val ptBr: String?,
                @Json(name = "ru")
                val ru: String?,
                @Json(name = "uk")
                val uk: String?,
                @Json(name = "ur")
                val ur: String?,
                @Json(name = "vi")
                val vi: String?,
                @Json(name = "zh")
                val zh: String?,
                @Json(name = "zh-hk")
                val zhHk: String?
            )

            @JsonClass(generateAdapter = true)
            data class Description(
                @Json(name = "en")
                val en: String,
                @Json(name = "es")
                val es: String?,
                @Json(name = "es-la")
                val esLa: String?,
                @Json(name = "fr")
                val fr: String?,
                @Json(name = "id")
                val id: String?,
                @Json(name = "ja")
                val ja: String?,
                @Json(name = "ko")
                val ko: String?,
                @Json(name = "pt-br")
                val ptBr: String?,
                @Json(name = "ru")
                val ru: String?,
                @Json(name = "th")
                val th: String?,
                @Json(name = "vi")
                val vi: String?,
                @Json(name = "zh")
                val zh: String?
            )

            @JsonClass(generateAdapter = true)
            data class Links(
                @Json(name = "al")
                val al: String?,
                @Json(name = "amz")
                val amz: String?,
                @Json(name = "ap")
                val ap: String?,
                @Json(name = "bw")
                val bw: String?,
                @Json(name = "ebj")
                val ebj: String?,
                @Json(name = "engtl")
                val engtl: String?,
                @Json(name = "kt")
                val kt: String?,
                @Json(name = "mal")
                val mal: String?,
                @Json(name = "mu")
                val mu: String,
                @Json(name = "nu")
                val nu: String?,
                @Json(name = "raw")
                val raw: String?
            )

            @JsonClass(generateAdapter = true)
            data class Tag(
                @Json(name = "attributes")
                val attributes: Attributes,
                @Json(name = "id")
                val id: String,
                @Json(name = "relationships")
                val relationships: List<Any?>,
                @Json(name = "type")
                val type: String
            ) {
                @JsonClass(generateAdapter = true)
                data class Attributes(
                    @Json(name = "description")
                    val description: Description?,
                    @Json(name = "group")
                    val group: String,
                    @Json(name = "name")
                    val name: Name,
                    @Json(name = "version")
                    val version: Int
                ) {
                    @JsonClass(generateAdapter = true)
                    class Description

                    @JsonClass(generateAdapter = true)
                    data class Name(
                        @Json(name = "en")
                        val en: String
                    )
                }
            }

            @JsonClass(generateAdapter = true)
            data class Title(
                @Json(name = "en")
                val en: String
            )
        }

        @JsonClass(generateAdapter = true)
        data class Relationship(
            @Json(name = "id")
            val id: String,
            @Json(name = "related")
            val related: String?,
            @Json(name = "type")
            val type: String
        )
    }
}