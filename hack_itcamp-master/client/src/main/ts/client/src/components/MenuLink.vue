<template>
  <div class="menu-link">
    <RouterLink v-bind:to="this.$props.to">{{this.$props.text}}</RouterLink>
  </div>
</template>

<script>
export default {
  name: "MenuLink",
  props: {
    to: String,
    text: String
  }
}
</script>

<style scoped>
  .menu-link {
    margin: 0.5em 0;
  }
</style>