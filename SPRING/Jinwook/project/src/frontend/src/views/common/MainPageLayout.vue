<template>
<v-app>
    <v-app-bar app clipped-right color="grey" black>
        <v-app-bar-nav-icon @click="drawer = true">
        </v-app-bar-nav-icon>
        <slot name="menubar"></slot>
    </v-app-bar>
    <v-navigation-drawer v-model="drawer" 
    app absolute temporary>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">로그인</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-Account</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">회원가입</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">공지사항</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
        <v-list dense>
            <v-list-item @click="left = !left">
                <v-list-item-action>
                    <v-icon>mdi-home</v-icon>
                </v-list-item-action>
                <v-list-item-content>
                    <v-list-item-title @click="home">고객센터</v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>

    </v-navigation-drawer>
</v-app>
</template>

<script>
import router from "@/router"
    export default {
        name: "Layout",
        data: () => ({
            drawer: true,
            left: false
        }),
    methods: {
        home() {
            (window.location.pathname !== '/') ? router.push('/') : router.go(0)
        }
    }
    }
</script>

<style scoped>
dirotns{
    fdsfdsfds;
}
</style>