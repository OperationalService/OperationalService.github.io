<template>
  <div id="app">
    <h1>Система управления рисками</h1>
    <div id="nav">
      <router-link to="/">Главная</router-link> |
      <router-link to="/view">Карта рисков</router-link> |
      <router-link to="/incident">Загрузка инцидента</router-link> |
      <router-link to="/about">О приложении</router-link>
    </div>
    <router-view/>
  </div>
</template>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
