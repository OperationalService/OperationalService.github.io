<template>
  <div class="home">
    <p>
      Приложение предназначено для управления рисками внутри компании.
      Функционал приложения позволяет сопоставить возможные риски и существующие бизнесс-процессы,
      оценить степень подготовленности бизнеса к наступлению рисковой ситуации,
      вести учёт случившихся инцидентов, получать инструкции по снижению ущерба от инцидентов,
      формировать отчёт о принятых мерах при борьбе с инцидентом.
    </p>
    <p>
      Рекомендуется начать с загрузки информации о бизнесс-процессах и рисках.
    </p>
    <MenuLink to="upload_structure" text="Загрузить структуру бизнесс-процессов" />
    <MenuLink to="upload_threats" text="Загрузить информацию о рисках" />
    <MenuLink to="view" text="Просмотреть структуру рисков" />
    <MenuLink to="incident" text="Внести информацию об инциденте" />
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import MenuLink from "@/components/MenuLink.vue"; // @ is an alias to /src

export default Vue.extend({
  name: 'Home',
  components: {
    MenuLink
  },
});
</script>
