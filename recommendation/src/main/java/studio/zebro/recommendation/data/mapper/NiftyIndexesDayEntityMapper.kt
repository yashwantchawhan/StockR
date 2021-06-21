package studio.zebro.recommendation.data.mapper

import studio.zebro.datasource.model.NiftyIndexesDayWiseDataModel
import studio.zebro.recommendation.data.entity.NiftyIndexesDayEntity

object NiftyIndexesDayEntityMapper {
    fun mapNiftyIndexesDayEntityToNiftyIndexesDayWiseDataModel(niftyIndexesDayEntity : NiftyIndexesDayEntity) : NiftyIndexesDayWiseDataModel{
        return NiftyIndexesDayWiseDataModel(
            niftyIndexesDayEntity.name,
            niftyIndexesDayEntity.value,
            niftyIndexesDayEntity.changePercentage,
            niftyIndexesDayEntity.changeValue,
            niftyIndexesDayEntity.isPositiveChange,
        )
    }

    fun mapNiftyIndexesDayWiseDataModelToNiftyIndexesDayEntity(niftyIndexesDayWiseDataModel : NiftyIndexesDayWiseDataModel) : NiftyIndexesDayEntity{
        return NiftyIndexesDayEntity(
            niftyIndexesDayWiseDataModel.name,
            niftyIndexesDayWiseDataModel.value,
            niftyIndexesDayWiseDataModel.changePercentage,
            niftyIndexesDayWiseDataModel.changeValue,
            niftyIndexesDayWiseDataModel.isPositiveChange,
        )
    }
}