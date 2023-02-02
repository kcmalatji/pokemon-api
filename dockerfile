FROM quay.io/wildfly/wildfly:latest


USER root
RUN yum update -y

ENV DEPLOY_DIR=/opt/jboss/wildfly/standalone/deployments

COPY target/pokemonApi-1.0.0-SNAPSHOT.war $DEPLOY_DIR
