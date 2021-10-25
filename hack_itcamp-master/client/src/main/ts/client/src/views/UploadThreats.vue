<template>
  <div class="home">
    <p>
      Вы можете загрузить риски и связать их с операционными процессами одним из
      предложенных ниже способов.
    </p>
    <div class="upload-div">
      <button disabled title="Функионал не реализован">Загрузить CSV</button>
    </div>
    <div class="upload-div">
      <button disabled title="Функионал не реализован">Загрузить Excel</button>
    </div>
    <div class="upload-div">
      <button>Загрузить тестовые данные</button>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import MenuLink from "@/components/MenuLink.vue"; // @ is an alias to /src

export default Vue.extend({
  name: 'UploadThreats',
  components: {

  },
});
</script>

<style scoped>
  .upload-div {
    margin: 0.5em 0;
  }
</style>