import apiClient from "@/api/AxiosClient";
import {BusinessProcess} from "@/models/BusinessProcess";
import {AxiosResponse} from "axios";

export async function getBusinessProcesses():Promise<AxiosResponse<Array<BusinessProcess>>> {
    return await apiClient.get('/structure/bp')
}

export async function uploadHardcode():Promise<AxiosResponse<Array<BusinessProcess>>> {
    return await apiClient.post('/structure/upload/hard_code')
}