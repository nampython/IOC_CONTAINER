package org.ioc;

public class ResolvedComponentDto {
    //Producer component is always a service
    private final ComponentModel producerComponentModel;
    //Might be a Bean
    private final ComponentModel actualComponentModel;

    public ResolvedComponentDto(ComponentModel producerComponentModel, ComponentModel actualComponentModel) {
        this.producerComponentModel = producerComponentModel;
        this.actualComponentModel = actualComponentModel;
    }

    public ComponentModel getProducerComponentModel() {
        return producerComponentModel;
    }

    public ComponentModel getActualComponentModel() {
        return actualComponentModel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResolvedComponentDto{");
        sb.append("producerComponentModel=").append(producerComponentModel);
        sb.append(", actualComponentModel=").append(actualComponentModel);
        sb.append('}');
        return sb.toString();
    }
}
