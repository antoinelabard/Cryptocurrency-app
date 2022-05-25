package fr.labard.cryptocurrencyapp.domain.model

import fr.labard.cryptocurrencyapp.data.remote.dto.TeamMember

class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)