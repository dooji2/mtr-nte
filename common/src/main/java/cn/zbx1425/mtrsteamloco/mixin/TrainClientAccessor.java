package cn.zbx1425.mtrsteamloco.mixin;

import mtr.data.TrainClient;
import mtr.render.TrainRendererBase;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TrainClient.class)
public interface TrainClientAccessor {

    @Accessor @Final @Mutable
    void setTrainRenderer(TrainRendererBase renderer);
}
