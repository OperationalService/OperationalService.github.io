import {Threat} from "@/models/Threat";

export interface OperationalProcess {
    code: string
    name: string
    description: string
    threats: Array<Threat>
}