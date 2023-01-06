import com.example.minnesotawild.data.api.RetrofitInstance
import com.example.minnesotawild.model.Team
import retrofit2.Response

class Repository {
    suspend fun getTeamInform(cardBin: String): Response<Team> {
        return RetrofitInstance.api.getCardInformation(cardBin)
    }
}