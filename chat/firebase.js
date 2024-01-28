//firebase.js

// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
// import { getAnalytics } from "firebase/analytics";
// import { getFirestore } from "firebase/firestore";
import { getFirestore, initializeFirestore } from "firebase/firestore";

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCOda1mc0QHVOohI0sAd85_1CZe0zXbG0E",
  authDomain: "nodejsapp-6aa0d.firebaseapp.com",
  projectId: "nodejsapp-6aa0d",
  storageBucket: "nodejsapp-6aa0d.appspot.com",
  messagingSenderId: "73428200498",
  appId: "1:73428200498:web:bd164f9607fe6b178e602b",
  measurementId: "G-K59JSRGGV9"
};



// Initialize Firebase
const app = initializeApp(firebaseConfig);
// const analytics = getAnalytics(app);

export const db = initializeFirestore(app, {
  experimentalForceLongPolling: true,
  
});
