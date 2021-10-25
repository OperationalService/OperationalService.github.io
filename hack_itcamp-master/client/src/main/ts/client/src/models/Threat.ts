import {Action} from "@/models/Action";

export interface Threat {
    code: string
    shortDescription: string
    longDescription: string
    isManaged: boolean
    actions: Array<Action>
}