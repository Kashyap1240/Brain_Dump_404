#!/bin/bash

# Set the base path where your Java files are stored
BASE_DIR="CruxLive/src"

# Loop through all Java files in lecture_* folders
find "$BASE_DIR" -type f -name "*.java" | while read file; do
  # Extract the lecture folder name (e.g., lecture_1)
  lecture_folder=$(basename "$(dirname "$file")")

  # Set the correct package name
  package_name="CruxLive.src.${lecture_folder}"

  echo "Updating package in $file to: $package_name"

  # Replace the existing package line or insert at top if missing
  # Assumes package is the first non-comment line
  sed -i "1s|^.*|package $package_name;|" "$file"
done
