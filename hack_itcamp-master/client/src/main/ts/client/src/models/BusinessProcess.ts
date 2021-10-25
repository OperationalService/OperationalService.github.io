import {OperationalProcess} from "@/models/OperationalProcess";

export interface BusinessProcess {
    code: string
    name: string
    description: string
    operationalProcesses: Array<OperationalProcess>
}