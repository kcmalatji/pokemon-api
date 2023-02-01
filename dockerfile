# FROM jboss/wildfly:latest
FROM quay.io/wildfly/wildfly:latest
# FROM openjdk:17-alpine

USER root
#RUN yum update -y

ENV DEPLOY_DIR=/opt/jboss/wildfly/standalone/deployments

COPY target/pokemonApi-1.0.0-SNAPSHOT.war $DEPLOY_DIR

#RUN rm -rf /opt/jboss/wildfly/modules/system/layers/base/org/slf4j/impl/main/*