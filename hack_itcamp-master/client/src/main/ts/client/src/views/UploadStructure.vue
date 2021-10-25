<template>
  <div class="home">
    <p>
      Вы можете загрузить бизнесс-процесс и включённые в него операционные процессы одним из
      предложенных ниже способов.
    </p>
    <div class="upload-div">
      <button disabled title="Функионал не реализован">Загрузить CSV</button>
    </div>
    <div class="upload-div">
      <button disabled title="Функионал не реализован">Загрузить Excel</button>
    </div>
    <div class="upload-div">
      <button v-on:click="uploadHardcode">Загрузить тестовые данные</button>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import MenuLink from "@/components/MenuLink.vue";
import {uploadHardcode} from "@/api/Process"; // @ is an alias to /src

export default Vue.extend({
  name: 'UploadStructure',
  components: {

  },
  methods: {
    uploadHardcode() {
      uploadHardcode()
    }
  }
});
</script>

<style scoped>
  .upload-div {
    margin: 0.5em 0;
  }
</style>